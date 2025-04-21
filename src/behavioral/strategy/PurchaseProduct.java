package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PurchaseProduct {

    private final Double totalAmount;
    private final List<PaymentEntry> payments;


    public PurchaseProduct(Double totalAmount) {
        this.totalAmount = totalAmount;
        this.payments = new ArrayList<>();
    }

    public void pay(PaymentStrategy paymentStrategy, double amount) {
        if (Objects.nonNull(paymentStrategy)) {
            if (amount <= this.remaining()) {
                if (!paymentStrategy.pay(amount)) {
                    System.err.println("Payment failed");
                    System.err.flush();
                }
                PaymentEntry paymentEntry = new PaymentEntry(paymentStrategy, amount);
                paymentEntry.doPayment();
                payments.add(paymentEntry);
            } else {
                System.err.println("Payment must be less than remaining amount");
                System.err.flush();
            }
        } else {
            System.err.println("Payment strategy not set");
            System.err.flush();
        }

        if (this.isPurchased()) {
            System.out.println("Purchase completed");
            System.out.flush();
        }
    }

    public Double paid() {
        return this.payments
                .stream()
                .filter(PaymentEntry::isSucceed)
                .map(PaymentEntry::getAmount)
                .mapToDouble(Double::valueOf)
                .sum();
    }

    public Double remaining() {
        return this.totalAmount - this.paid();
    }

    public Boolean isPurchased() {
        return this.remaining() == 0;
    }

    @Override
    public String toString() {
        String purchase = this.isPurchased() ? "Purchase completed" : "Purchase remaining";
        return "PurchaseProduct{" +
                "totalAmount=" + this.totalAmount +
                ", paid=" + this.paid() +
                ", remaining=" + this.remaining() +
                ", " + purchase +
                '}';
    }
}

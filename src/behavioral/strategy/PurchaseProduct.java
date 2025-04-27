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
                PaymentEntry paymentEntry = new PaymentEntry(paymentStrategy, amount);
                paymentEntry.doPayment();
                payments.add(paymentEntry);
                if (!paymentEntry.isSucceed()) {
                    Main.errPrintln("Payment failed");
                }
            } else {
                Main.errPrintln("Payment must be less than remaining amount");
            }
        } else {
            Main.errPrintln("Payment strategy not set");
        }

        if (this.isPurchased()) {
            Main.println("Purchase completed");
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

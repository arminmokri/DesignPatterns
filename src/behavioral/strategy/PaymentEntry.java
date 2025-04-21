package behavioral.strategy;

public class PaymentEntry {
    private final PaymentStrategy strategy;
    private final Double amount;
    private Boolean success;

    public PaymentEntry(PaymentStrategy strategy, double amount) {
        this.strategy = strategy;
        this.amount = amount;
    }

    public void doPayment() {
        this.success = this.strategy.pay(amount);
    }

    public Double getAmount() {
        return this.amount;
    }

    public Boolean isSucceed() {
        return this.success;
    }
}

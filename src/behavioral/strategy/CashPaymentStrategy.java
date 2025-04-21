package behavioral.strategy;

public class CashPaymentStrategy extends PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        super.amount = amount;
        super.success = Boolean.TRUE;
        System.out.println("Paid $" + super.amount + " using Cash.");
        System.out.flush();
        return super.success;
    }

}

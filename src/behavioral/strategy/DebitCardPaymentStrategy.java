package behavioral.strategy;

public class DebitCardPaymentStrategy extends PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        super.amount = amount;
        super.success = Boolean.TRUE;
        System.out.println("Paid $" + super.amount + " using Debit Card.");
        System.out.flush();
        return super.success;
    }

}

package behavioral.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        System.out.println("Paid $" + amount + " using Debit Card.");
        System.out.flush();
        return Boolean.TRUE;
    }

}

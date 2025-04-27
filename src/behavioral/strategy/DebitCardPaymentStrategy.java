package behavioral.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        Main.println("Paid $" + amount + " using Debit Card.");
        return Boolean.TRUE;
    }

}

package behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        Main.println("Paid $" + amount + " using Credit Card.");
        return Boolean.TRUE;
    }

}

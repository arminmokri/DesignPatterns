package behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
        System.out.flush();
        return Boolean.TRUE;
    }

}

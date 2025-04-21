package behavioral.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        System.out.println("Paid $" + amount + " using Cash.");
        System.out.flush();
        return Boolean.TRUE;
    }

}

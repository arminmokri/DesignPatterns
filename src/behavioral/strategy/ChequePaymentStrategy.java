package behavioral.strategy;

public class ChequePaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        Main.println("Paid $" + amount + " using Cheque.");
        return Boolean.TRUE;
    }

}

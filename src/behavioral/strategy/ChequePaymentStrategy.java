package behavioral.strategy;

public class ChequePaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        System.out.println("Paid $" + amount + " using Cheque.");
        System.out.flush();
        return Boolean.TRUE;
    }

}

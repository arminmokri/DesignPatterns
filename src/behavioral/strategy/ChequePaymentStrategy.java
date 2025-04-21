package behavioral.strategy;

public class ChequePaymentStrategy extends PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        super.amount = amount;
        super.success = Boolean.TRUE;
        System.out.println("Paid $" + super.amount + " using Cheque.");
        System.out.flush();
        return super.success;
    }

}

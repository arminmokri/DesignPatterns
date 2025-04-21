package behavioral.strategy;

//public abstract class PaymentStrategy {
//
//    protected Double amount;
//    protected Boolean success;
//
//    Double getAmount() {
//        return this.amount;
//    }
//
//    Boolean isSucceed() {
//        return this.success;
//    }
//
//    abstract Boolean pay(Double amount);
//
//}


public interface PaymentStrategy {
    Boolean pay(Double amount);
}

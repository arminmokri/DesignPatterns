package behavioral.strategy;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /**
         Imagine that we want to buy $2,505 worth of kitchen items.
         We pay as follows:
         - $1,000 by cheque, postdated for next month
         - $1,000 with a credit card
         - $500 with a debit card
         - $5 in cash
         */

        PurchaseProduct purchaseProduct = new PurchaseProduct(2505d);

        purchaseProduct.pay(null, 2505d);
        System.out.println(purchaseProduct.toString());
        System.out.println();
        Thread.sleep(1000);

        purchaseProduct.pay(new ChequePaymentStrategy(), 1000d);
        System.out.println(purchaseProduct.toString());
        System.out.println();
        Thread.sleep(1000);

        purchaseProduct.pay(new CreditCardPaymentStrategy(), 1000d);
        System.out.println(purchaseProduct.toString());
        System.out.println();
        Thread.sleep(1000);

        purchaseProduct.pay(new DebitCardPaymentStrategy(), 500d);
        System.out.println(purchaseProduct.toString());
        System.out.println();
        Thread.sleep(1000);

        purchaseProduct.pay(new CashPaymentStrategy(), 50d);
        System.out.println(purchaseProduct.toString());
        System.out.println();
        Thread.sleep(1000);

        purchaseProduct.pay(new CashPaymentStrategy(), 5d);
        System.out.println(purchaseProduct.toString());
        System.out.println();
        Thread.sleep(1000);
    }
}

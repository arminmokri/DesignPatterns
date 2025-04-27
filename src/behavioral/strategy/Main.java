package behavioral.strategy;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

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
        println(purchaseProduct.toString());
        println();
        Thread.sleep(1000);

        purchaseProduct.pay(new ChequePaymentStrategy(), 1000d);
        println(purchaseProduct.toString());
        println();
        Thread.sleep(1000);

        purchaseProduct.pay(new CreditCardPaymentStrategy(), 1000d);
        println(purchaseProduct.toString());
        println();
        Thread.sleep(1000);

        purchaseProduct.pay(new DebitCardPaymentStrategy(), 500d);
        println(purchaseProduct.toString());
        println();
        Thread.sleep(1000);

        purchaseProduct.pay(new CashPaymentStrategy(), 50d);
        println(purchaseProduct.toString());
        println();
        Thread.sleep(1000);

        while (!purchaseProduct.isPurchased()) {
            purchaseProduct.pay(new CashPaymentStrategy(), 5d);
            println(purchaseProduct.toString());
            println();
            Thread.sleep(1000);
        }
    }
}

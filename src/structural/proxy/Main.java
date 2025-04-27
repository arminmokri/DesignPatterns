package structural.proxy;

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
        BankService realService = new RealBankService();
        TransactionManager txManager = new TransactionManager();

        BankService proxy = new TransactionalBankServiceProxy(realService, txManager);

        proxy.transfer(new TransferRequest("Alice", "Bob", 500));
        println();
        Thread.sleep(1000);

        proxy.transfer(new TransferRequest("Alice", "Bob", 5000));
        println();
        Thread.sleep(1000);
    }
}


package structural.proxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankService realService = new RealBankService();
        TransactionManager txManager = new TransactionManager();

        BankService proxy = new TransactionalBankServiceProxy(realService, txManager);

        proxy.transfer(new TransferRequest("Alice", "Bob", 500));
        System.out.println();
        Thread.sleep(1000);


        proxy.transfer(new TransferRequest("Alice", "Bob", 5000));
        System.out.println();
        Thread.sleep(1000);
    }
}


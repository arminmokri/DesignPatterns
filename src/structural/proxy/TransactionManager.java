package structural.proxy;

public class TransactionManager {
    public void begin() {
        Main.println("Transaction started");
    }

    public void commit() {
        Main.println("Transaction committed");
    }

    public void rollback() {
        Main.println("Transaction rolled back");
    }
}

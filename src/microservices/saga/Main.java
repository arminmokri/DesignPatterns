package microservices.saga;

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
        SagaExecutor sagaExecutor = new SagaExecutor();

        // Add actions to the saga
        sagaExecutor.addAction(new CreateOrderAction());
        sagaExecutor.addAction(new ReserveInventoryAction());
        sagaExecutor.addAction(new ChargeCustomerAction());
        sagaExecutor.addAction(new ShipOrderAction());

        // Simulate the saga execution with an exception in the middle
        for (int i = 0; i < 5; i++) {
            try {
                println("Starting saga...");
                sagaExecutor.execute();
            } finally {
                println("Finish saga.");
            }
            println();
            Thread.sleep(1000);
        }
    }
}

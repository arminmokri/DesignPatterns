package microservices.saga;

public class ShipOrderAction implements SagaAction {
    @Override
    public void execute() throws RuntimeException {
        Main.println("Order shipped.");
    }

    @Override
    public void compensate() throws RuntimeException {
        Main.println("Order shipment undone.");
    }
}

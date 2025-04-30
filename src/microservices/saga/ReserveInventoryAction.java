package microservices.saga;

public class ReserveInventoryAction implements SagaAction {
    @Override
    public void execute() throws RuntimeException {
        Main.println("Inventory reserved.");
    }

    @Override
    public void compensate() throws RuntimeException {
        Main.println("Inventory reservation undone.");
    }
}

package microservices.saga;

public class CreateOrderAction implements SagaAction {
    @Override
    public void execute() throws RuntimeException {
        Main.println("Order created.");
    }

    @Override
    public void compensate() throws RuntimeException {
        Main.println("Order creation undone.");
    }
}

package microservices.saga;

import java.util.Random;

public class ChargeCustomerAction implements SagaAction {
    @Override
    public void execute() throws RuntimeException {
        int random = new Random().nextInt(100);
        if (random < 50) {
            Main.println("Customer charged.");
        } else {
            throw new RuntimeException("not enough money");
        }

    }

    @Override
    public void compensate() throws RuntimeException {
        Main.println("Customer charge undone.");
    }
}

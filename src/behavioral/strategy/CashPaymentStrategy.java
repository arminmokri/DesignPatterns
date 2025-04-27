package behavioral.strategy;

import java.util.Random;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public Boolean pay(Double amount) {
        int random = new Random().nextInt(100);
        if (random >= 10 && random < 43) {
            Main.println("Paid $" + amount + " using Cash.");
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}

package behavioral.observer;

public class MobileView implements PriceObserver {
    @Override
    public void update(float newPrice) {
        System.out.println("Mobile View: Price updated to $" + newPrice);
    }
}

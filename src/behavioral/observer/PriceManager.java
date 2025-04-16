package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PriceManager {
    private final List<PriceObserver> subscribers = new ArrayList<>();
    private float price;

    public void subscribe(PriceObserver observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(PriceObserver observer) {
        subscribers.remove(observer);
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    private void notifyObservers() {
        for (PriceObserver observer : subscribers) {
            observer.update(price);
        }
    }
}

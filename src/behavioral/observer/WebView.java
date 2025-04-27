package behavioral.observer;

public class WebView implements PriceObserver {
    @Override
    public void update(float newPrice) {
        Main.println("Web View: Price updated to $" + newPrice);
    }
}

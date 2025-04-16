package behavioral.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PriceManager priceManager = new PriceManager();

        // Creating observers
        PriceObserver mobileView = new MobileView();
        PriceObserver webView = new WebView();

        // subscribe observers
        priceManager.subscribe(mobileView);
        priceManager.subscribe(webView);

        // Simulate price updates
        Thread.sleep(2000);
        priceManager.setPrice(99.99f);

        Thread.sleep(2000);
        priceManager.setPrice(89.49f);

        // unsubscribe observers
        priceManager.unsubscribe(mobileView);

        // Simulate price updates
        Thread.sleep(2000);
        priceManager.setPrice(100.12f);
    }
}

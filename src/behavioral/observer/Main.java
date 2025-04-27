package behavioral.observer;

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
        PriceManager priceManager = new PriceManager();

        // Creating observers
        PriceObserver mobileView = new MobileView();
        PriceObserver webView = new WebView();

        // subscribe observers
        priceManager.subscribe(mobileView);
        priceManager.subscribe(webView);

        // Simulate price updates
        priceManager.setPrice(99.99f);
        println();
        Thread.sleep(2000);

        // Simulate price updates
        priceManager.setPrice(89.49f);
        println();
        Thread.sleep(2000);

        // unsubscribe observers
        priceManager.unsubscribe(mobileView);

        // Simulate price updates
        priceManager.setPrice(100.12f);
        println();
        Thread.sleep(2000);
    }
}

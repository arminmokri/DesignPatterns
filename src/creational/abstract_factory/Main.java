package creational.abstract_factory;

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
        // French Bakery
        BakeryFactory frenchBakery = new FrenchBakeryFactory();

        Cake frenchCake = frenchBakery.createCake();
        frenchCake.prepare();
        println();
        Thread.sleep(1000);

        Croissant frenchCroissant = frenchBakery.createCroissant();
        frenchCroissant.prepare();
        println();
        Thread.sleep(1000);

        // Italian Bakery
        BakeryFactory italianBakery = new ItalianBakeryFactory();
        Cake italianCake = italianBakery.createCake();
        italianCake.prepare();
        println();
        Thread.sleep(1000);

        Croissant italianCroissant = italianBakery.createCroissant();
        italianCroissant.prepare();
        println();
        Thread.sleep(1000);
    }
}

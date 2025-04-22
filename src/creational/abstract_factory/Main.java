package creational.abstract_factory;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // French Bakery
        BakeryFactory frenchBakery = new FrenchBakeryFactory();

        Cake frenchCake = frenchBakery.createCake();
        frenchCake.prepare();
        System.out.println();
        Thread.sleep(1000);

        Croissant frenchCroissant = frenchBakery.createCroissant();
        frenchCroissant.prepare();
        System.out.println();
        Thread.sleep(1000);

        // Italian Bakery
        BakeryFactory italianBakery = new ItalianBakeryFactory();
        Cake italianCake = italianBakery.createCake();
        italianCake.prepare();
        System.out.println();
        Thread.sleep(1000);

        Croissant italianCroissant = italianBakery.createCroissant();
        italianCroissant.prepare();
        System.out.println();
        Thread.sleep(1000);
    }
}

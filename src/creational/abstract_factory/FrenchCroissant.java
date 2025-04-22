package creational.abstract_factory;

public class FrenchCroissant implements Croissant {
    @Override
    public void prepare() {
        System.out.println("Baking a classic buttery French Croissant!");
        System.out.flush();
    }
}

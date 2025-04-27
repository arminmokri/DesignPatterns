package creational.abstract_factory;

public class FrenchCroissant implements Croissant {
    @Override
    public void prepare() {
        Main.println("Baking a classic buttery French Croissant!");
    }
}

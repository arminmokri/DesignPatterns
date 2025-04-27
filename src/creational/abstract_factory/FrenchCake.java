package creational.abstract_factory;

public class FrenchCake implements Cake {
    @Override
    public void prepare() {
        Main.println("Preparing a fancy French Cake with layers!");
    }
}
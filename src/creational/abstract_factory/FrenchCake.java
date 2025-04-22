package creational.abstract_factory;

public class FrenchCake implements Cake {
    @Override
    public void prepare() {
        System.out.println("Preparing a fancy French Cake with layers!");
        System.out.flush();
    }
}
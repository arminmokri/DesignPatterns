package creational.abstract_factory;

public class ItalianCake implements Cake {
    @Override
    public void prepare() {
        Main.println("Preparing an Italian Tiramisu Cake!");
    }
}

package creational.abstract_factory;

public class ItalianCake implements Cake {
    @Override
    public void prepare() {
        System.out.println("Preparing an Italian Tiramisu Cake!");
        System.out.flush();
    }
}

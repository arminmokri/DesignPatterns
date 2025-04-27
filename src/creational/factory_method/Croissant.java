package creational.factory_method;

public class Croissant implements PastryItem {
    @Override
    public void prepare() {
        Main.println("Baking a buttery Croissant!");
    }
}

package creational.factory_method;

public class Croissant implements PastryItem {
    @Override
    public void prepare() {
        System.out.println("Baking a buttery Croissant!");
        System.out.flush();
    }
}

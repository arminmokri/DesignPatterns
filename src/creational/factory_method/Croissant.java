package creational.factory_method;

public class Croissant implements Pastry {
    @Override
    public void prepare() {
        System.out.println("Baking a buttery Croissant!");
        System.out.flush();
    }
}

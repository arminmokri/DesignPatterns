package creational.factory;

public class Croissant implements Pastry {
    @Override
    public void prepare() {
        System.out.println("Baking a buttery Croissant!");
        System.out.flush();
    }
}

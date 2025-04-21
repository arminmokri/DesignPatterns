package creational.factory;

public class Cake implements Pastry {
    @Override
    public void prepare() {
        System.out.println("Preparing a delicious Cake!");
        System.out.flush();
    }
}
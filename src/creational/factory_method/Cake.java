package creational.factory_method;

public class Cake implements PastryItem {
    @Override
    public void prepare() {
        Main.println("Preparing a delicious Cake!");
    }
}
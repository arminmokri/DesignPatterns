package creational.factory_method;

public class Cake implements PastryItem {
    @Override
    public void prepare() {
        System.out.println("Preparing a delicious Cake!");
        System.out.flush();
    }
}
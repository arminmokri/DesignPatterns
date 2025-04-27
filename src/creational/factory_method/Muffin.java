package creational.factory_method;

public class Muffin implements PastryItem {
    @Override
    public void prepare() {
        Main.println("Making a fluffy Muffin!");
    }
}

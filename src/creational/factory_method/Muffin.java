package creational.factory_method;

public class Muffin implements Pastry {
    @Override
    public void prepare() {
        System.out.println("Making a fluffy Muffin!");
        System.out.flush();
    }
}

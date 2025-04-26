package creational.factory_method;

public class MuffinFactory extends PastryFactory {
    @Override
    public Pastry createPastry() {
        return new Muffin();
    }
}

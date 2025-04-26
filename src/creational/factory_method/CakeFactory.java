package creational.factory_method;

public class CakeFactory extends PastryFactory {
    @Override
    public Pastry createPastry() {
        return new Cake();
    }
}

package creational.factory_method;

public class CroissantFactory extends PastryFactory {
    @Override
    public Pastry createPastry() {
        return new Croissant();
    }
}

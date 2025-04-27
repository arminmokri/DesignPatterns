package creational.factory_method;

public class CroissantPastry extends Pastry {
    @Override
    public PastryItem createPastryItem() {
        return new Croissant();
    }
}

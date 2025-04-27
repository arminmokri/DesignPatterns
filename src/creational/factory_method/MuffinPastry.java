package creational.factory_method;

public class MuffinPastry extends Pastry {
    @Override
    public PastryItem createPastryItem() {
        return new Muffin();
    }
}

package creational.factory_method;

public class CakePastry extends Pastry {
    @Override
    public PastryItem createPastryItem() {
        return new Cake();
    }
}

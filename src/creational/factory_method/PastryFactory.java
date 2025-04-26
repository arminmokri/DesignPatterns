package creational.factory_method;

public abstract class PastryFactory {
    public abstract Pastry createPastry();

    public void orderPastry() {
        Pastry pastry = createPastry();
        pastry.prepare();
    }
}

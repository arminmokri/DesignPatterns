package creational.factory_method;

public abstract class Pastry {
    public abstract PastryItem createPastryItem();

    public void orderItem() {
        PastryItem pastry = createPastryItem();
        pastry.prepare();
    }
}

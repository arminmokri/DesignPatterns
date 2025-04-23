package structural.decorator;

public abstract class WaffleDecorator implements Waffle {
    protected Waffle decoratedWaffle;

    public WaffleDecorator(Waffle waffle) {
        this.decoratedWaffle = waffle;
    }

    public String getDescription() {
        return decoratedWaffle.getDescription();
    }

    public double getCost() {
        return decoratedWaffle.getCost();
    }
}

package structural.decorator;

public class Strawberry extends WaffleDecorator {
    public Strawberry(Waffle waffle) {
        super(waffle);
    }

    public String getDescription() {
        return decoratedWaffle.getDescription() + ", Strawberry";
    }

    public double getCost() {
        return decoratedWaffle.getCost() + 1.2;
    }
}

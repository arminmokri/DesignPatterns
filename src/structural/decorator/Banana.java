package structural.decorator;

public class Banana extends WaffleDecorator {
    public Banana(Waffle waffle) {
        super(waffle);
    }

    public String getDescription() {
        return decoratedWaffle.getDescription() + ", Banana";
    }

    public double getCost() {
        return decoratedWaffle.getCost() + 1.0;
    }
}

package structural.decorator;

public class PeanutButter extends WaffleDecorator {
    public PeanutButter(Waffle waffle) {
        super(waffle);
    }

    public String getDescription() {
        return decoratedWaffle.getDescription() + ", Peanut Butter";
    }

    public double getCost() {
        return decoratedWaffle.getCost() + 1.3;
    }
}

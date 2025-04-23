package structural.decorator;

public class Nutella extends WaffleDecorator {
    public Nutella(Waffle waffle) {
        super(waffle);
    }

    public String getDescription() {
        return decoratedWaffle.getDescription() + ", Nutella";
    }

    public double getCost() {
        return decoratedWaffle.getCost() + 1.5;
    }
}

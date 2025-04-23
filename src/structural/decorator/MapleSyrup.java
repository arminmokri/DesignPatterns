package structural.decorator;

public class MapleSyrup extends WaffleDecorator {
    public MapleSyrup(Waffle waffle) {
        super(waffle);
    }

    public String getDescription() {
        return decoratedWaffle.getDescription() + ", Maple Syrup";
    }

    public double getCost() {
        return decoratedWaffle.getCost() + 0.8;
    }
}

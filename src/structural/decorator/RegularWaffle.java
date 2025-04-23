package structural.decorator;

public class RegularWaffle implements Waffle {
    public String getDescription() {
        return "Regular Waffle";
    }

    public double getCost() {
        return 3.0;
    }
}

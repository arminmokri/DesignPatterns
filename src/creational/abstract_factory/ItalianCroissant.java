package creational.abstract_factory;

public class ItalianCroissant implements Croissant {
    @Override
    public void prepare() {
        Main.println("Baking an Italian-style Cornetto!");
    }
}

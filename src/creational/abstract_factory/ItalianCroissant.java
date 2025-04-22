package creational.abstract_factory;

public class ItalianCroissant implements Croissant {
    @Override
    public void prepare() {
        System.out.println("Baking an Italian-style Cornetto!");
        System.out.flush();
    }
}

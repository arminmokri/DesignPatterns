package creational.abstract_factory;

public class ItalianBakeryFactory implements BakeryFactory {
    @Override
    public Cake createCake() {
        return new ItalianCake();
    }

    @Override
    public Croissant createCroissant() {
        return new ItalianCroissant();
    }
}

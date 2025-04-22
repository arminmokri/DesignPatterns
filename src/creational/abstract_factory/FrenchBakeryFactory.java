package creational.abstract_factory;

public class FrenchBakeryFactory implements BakeryFactory {
    @Override
    public Cake createCake() {
        return new FrenchCake();
    }

    @Override
    public Croissant createCroissant() {
        return new FrenchCroissant();
    }
}

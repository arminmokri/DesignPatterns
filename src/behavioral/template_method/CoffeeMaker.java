package behavioral.template_method;

public class CoffeeMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding sugar and milk...");
    }
}

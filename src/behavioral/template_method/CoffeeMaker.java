package behavioral.template_method;

public class CoffeeMaker extends BeverageMaker {

    @Override
    protected void brew() {
        Main.println("Dripping coffee through filter...");
    }

    @Override
    protected void addExtras() {
        Main.println("Adding sugar and milk...");
    }
}

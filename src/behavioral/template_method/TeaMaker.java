package behavioral.template_method;

public class TeaMaker extends BeverageMaker {

    @Override
    protected void brew() {
        Main.println("Steeping the tea...");
    }

    @Override
    protected void addExtras() {
        Main.println("Adding lemon...");
    }
}

package behavioral.template_method;

public class TeaMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding lemon...");
    }
}

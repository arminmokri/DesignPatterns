package behavioral.template_method;

public abstract class BeverageMaker {

    // Template method
    public final void makeBeverage() {
        boilWater();
        brew();
        pourIntoCup();
        addExtras();
    }

    protected void boilWater() {
        System.out.println("Boiling water...");
    }

    protected abstract void brew(); // Step to be implemented by subclasses

    protected void pourIntoCup() {
        System.out.println("Pouring into cup...");
    }

    protected abstract void addExtras(); // Another customizable step
}

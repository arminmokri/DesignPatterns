package behavioral.template_method;

public abstract class BeverageMaker {

    // Template method
    public final void makeBeverage() throws InterruptedException {
        Thread.sleep(1000);
        boilWater();
        Thread.sleep(1000);
        brew();
        Thread.sleep(1000);
        pourIntoCup();
        Thread.sleep(1000);
        addExtras();
        Thread.sleep(1000);
    }

    protected void boilWater() {
        Main.println("Boiling water...");
    }

    protected abstract void brew(); // Step to be implemented by subclasses

    protected void pourIntoCup() {
        Main.println("Pouring into cup...");
    }

    protected abstract void addExtras(); // Another customizable step
}

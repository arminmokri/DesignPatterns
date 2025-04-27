package behavioral.template_method;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

    public static void main(String[] args) throws InterruptedException {
        BeverageMaker tea = new TeaMaker();
        BeverageMaker coffee = new CoffeeMaker();

        println("Making tea:");
        tea.makeBeverage();
        println();
        Thread.sleep(2000);

        println("Making coffee:");
        coffee.makeBeverage();
        println();
        Thread.sleep(2000);
    }
}

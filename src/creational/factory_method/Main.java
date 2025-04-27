package creational.factory_method;

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

        Pastry cakePastry = new CakePastry();
        cakePastry.orderItem();
        println();
        Thread.sleep(1000);

        Pastry croissantPastry = new CroissantPastry();
        croissantPastry.orderItem();
        println();
        Thread.sleep(1000);

        Pastry muffinPastry = new MuffinPastry();
        muffinPastry.orderItem();
        println();
        Thread.sleep(1000);

    }
}

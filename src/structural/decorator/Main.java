package structural.decorator;

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

        // my favorite one
        Waffle waffle1 = new RegularWaffle();
        waffle1 = new Banana(waffle1);
        waffle1 = new Strawberry(waffle1);
        waffle1 = new PeanutButter(waffle1);
        println(waffle1.getDescription());
        println("Total: $" + waffle1.getCost());
        println();
        Thread.sleep(2000);

        Waffle waffle2 = new RegularWaffle();
        waffle2 = new Banana(waffle2);
        waffle2 = new MapleSyrup(waffle2);
        waffle2 = new Nutella(waffle2);
        println(waffle2.getDescription());
        println("Total: $" + waffle2.getCost());
        println();
        Thread.sleep(2000);
    }
}

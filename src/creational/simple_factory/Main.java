package creational.simple_factory;

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
        Shape shape1 = ShapeFactory.createShape(ShapeFactory.CIRCLE);
        shape1.draw();
        println();
        Thread.sleep(2000);

        try {
            Shape shape2 = ShapeFactory.createShape("triangle");
            shape2.draw();
        } catch (RuntimeException runtimeException) {
            errPrintln(runtimeException.getMessage());
            println();
            Thread.sleep(2000);
        }

        Shape shape3 = ShapeFactory.createShape(ShapeFactory.SQUARE);
        shape3.draw();
        println();
        Thread.sleep(2000);
    }
}
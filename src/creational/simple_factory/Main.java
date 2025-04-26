package creational.simple_factory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shape shape1 = ShapeFactory.createShape("circle");
        shape1.draw();
        System.out.println();
        System.out.flush();
        Thread.sleep(2000);

        try {
            Shape shape2 = ShapeFactory.createShape("triangle");
            shape2.draw();
        } catch (RuntimeException runtimeException){
            System.err.println(runtimeException.getMessage());
            System.err.println();
            System.err.flush();
            Thread.sleep(1000);
        }

        Shape shape3 = ShapeFactory.createShape("square");
        shape3.draw();
        System.out.println();
        System.out.flush();
        Thread.sleep(2000);
    }
}
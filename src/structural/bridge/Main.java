package structural.bridge;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        DrawingAPI openGL= new OpenGLAPI();
        DrawingAPI directX= new DirectXAPI();


        Shape circle1 = new Circle(5, 10, 2, openGL);
        circle1.draw();  // OpenGL drawing circle at (5, 10) with radius 2
        System.out.println();
        Thread.sleep(1000);


        Shape circle2 = new Circle(5, 10, 2, directX);
        circle2.draw();  // DirectX drawing circle at (5, 10) with radius 2
        System.out.println();
        Thread.sleep(1000);

        Shape rectangle1 = new Rectangle(0, 0, 4, 3, directX);
        rectangle1.draw(); // DirectX drawing rectangle...
        System.out.println();
        Thread.sleep(1000);

        Shape rectangle2 = new Rectangle(0, 0, 4, 3, openGL);
        rectangle2.draw(); // DirectX drawing rectangle...
        System.out.println();
        Thread.sleep(1000);

        rectangle2.resize(2); // Make it bigger
        rectangle2.draw(); // Now draws a bigger rectangle
        System.out.println();
        Thread.sleep(1000);
    }
}

package structural.bridge;

public class OpenGLAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.println("OpenGL drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }

    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("OpenGL drawing rectangle at (" + x + ", " + y + ") with size " + width + "x" + height);
    }
}

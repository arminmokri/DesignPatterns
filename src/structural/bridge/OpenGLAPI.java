package structural.bridge;

public class OpenGLAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        Main.println("OpenGL drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }

    public void drawRectangle(double x, double y, double width, double height) {
        Main.println("OpenGL drawing rectangle at (" + x + ", " + y + ") with size " + width + "x" + height);
    }
}

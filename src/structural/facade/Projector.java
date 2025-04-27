package structural.facade;

public class Projector {
    public void on() {
        Main.println("Projector ON");
    }

    public void setInput(String input) {
        Main.println("Projector input set to " + input);
    }

    public void off() {
        Main.println("Projector OFF");
    }
}

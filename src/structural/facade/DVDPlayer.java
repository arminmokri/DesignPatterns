package structural.facade;

public class DVDPlayer {
    public void on() {
        Main.println("DVD Player ON");
    }

    public void play(String movie) {
        Main.println("Playing movie: " + movie);
    }

    public void off() {
        Main.println("DVD Player OFF");
    }
}

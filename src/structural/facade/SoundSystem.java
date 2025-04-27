package structural.facade;

public class SoundSystem {
    public void on() {
        Main.println("Sound system ON");
    }

    public void setVolume(int level) {
        Main.println("Volume set to " + level);
    }

    public void off() {
        Main.println("Sound system OFF");
    }
}
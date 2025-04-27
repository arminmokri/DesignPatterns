package structural.facade;

public class HomeTheaterFacade {
    private final DVDPlayer dvd;
    private final Projector projector;
    private final SoundSystem sound;
    private final Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
    }

    public void watchMovie(String movie) throws InterruptedException {
        Main.println("Getting ready to watch a movie...");
        Thread.sleep(1000);
        lights.dim();
        Thread.sleep(1000);
        projector.on();
        Thread.sleep(1000);
        projector.setInput("DVD");
        Thread.sleep(1000);
        sound.on();
        Thread.sleep(1000);
        sound.setVolume(10);
        Thread.sleep(1000);
        dvd.on();
        Thread.sleep(1000);
        dvd.play(movie);
        Thread.sleep(1000);
    }

    public void endMovie() throws InterruptedException {
        Main.println("Shutting movie theater down...");
        Thread.sleep(1000);
        dvd.off();
        Thread.sleep(1000);
        projector.off();
        Thread.sleep(1000);
        sound.off();
        Thread.sleep(1000);
        lights.on();
        Thread.sleep(1000);
    }
}

package structural.facade;

public class Main {
    public static void main(String[] args)  throws InterruptedException {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound, lights);

        homeTheater.watchMovie("The Lord of the Rings"); // my favorite movie :)
        System.out.println();
        System.out.flush();

        homeTheater.endMovie();
        System.out.println();
        System.out.flush();
    }
}


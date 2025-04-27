package behavioral.visitor;

import java.util.List;

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
        List<FileElement> files = List.of(
                new TextFile("notes.txt", 10),
                new ImageFile("photo.png", 1080),
                new AudioFile("song.mp3", 240)
        );

        FileVisitor infoPrinter = new InfoPrinterVisitor();

        for (FileElement file : files) {
            file.accept(infoPrinter);
            Thread.sleep(1000);
        }
    }
}
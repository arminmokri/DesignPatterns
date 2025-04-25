package behavioral.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FileElement> files = List.of(
                new TextFile("notes.txt", 10),
                new ImageFile("photo.png", 1080),
                new AudioFile("song.mp3", 240)
        );

        FileVisitor infoPrinter = new InfoPrinterVisitor();

        for (FileElement file : files) {
            file.accept(infoPrinter);
        }
    }
}
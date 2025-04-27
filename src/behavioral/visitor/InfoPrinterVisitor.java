package behavioral.visitor;

public class InfoPrinterVisitor implements FileVisitor {

    @Override
    public void visit(TextFile textFile) {
        Main.println("TextFile: " + textFile.getName() + " (" + textFile.getSize() + "KB)");
    }

    @Override
    public void visit(ImageFile imageFile) {
        Main.println("ImageFile: " + imageFile.getName() + " (" + imageFile.getResolution() + "px)");
    }

    @Override
    public void visit(AudioFile audioFile) {
        Main.println("AudioFile: " + audioFile.getName() + " (" + audioFile.getDuration() + "sec)");
    }
}

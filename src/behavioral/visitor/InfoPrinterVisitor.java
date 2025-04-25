package behavioral.visitor;

public class InfoPrinterVisitor implements FileVisitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("TextFile: " + textFile.getName() + " (" + textFile.getSize() + "KB)");
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("ImageFile: " + imageFile.getName() + " (" + imageFile.getResolution() + "px)");
    }

    @Override
    public void visit(AudioFile audioFile) {
        System.out.println("AudioFile: " + audioFile.getName() + " (" + audioFile.getDuration() + "sec)");
    }
}

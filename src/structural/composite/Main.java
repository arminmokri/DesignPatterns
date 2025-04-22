package structural.composite;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");

        Directory docs = new Directory("Documents");
        Directory pics = new Directory("Pictures");

        File file1 = new File("resume.pdf");
        File file2 = new File("photo.jpg");
        File file3 = new File("budget.xlsx");

        docs.add(file1);
        docs.add(file3);
        pics.add(file2);

        root.add(docs);
        root.add(pics);

        root.display("");
    }
}

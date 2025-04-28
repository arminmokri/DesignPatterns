package structural.composite;

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

        root.display(null);
    }
}

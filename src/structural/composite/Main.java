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

        Directory dirDocs = new Directory("Documents");
        Directory dirProj = new Directory("Projects");
        Directory dirPics = new Directory("Pictures");

        File fileProjects = new File("Projects.xls");
        File fileResumeDOC = new File("resume.doc");
        File fileResumePDF = new File("resume.pdf");
        File filePhoto = new File("photo.jpg");
        File fileBudgetXLS = new File("budget.xls");
        File fileBudgetPDF = new File("budget.pdf");

        dirDocs.add(fileResumePDF);
        root.add(fileBudgetXLS);
        dirDocs.add(fileResumeDOC);
        dirPics.add(filePhoto);

        root.add(dirPics);
        root.add(dirDocs);
        root.add(dirProj);

        dirProj.add(fileProjects);
        root.add(fileBudgetPDF);

        root.display(null);
    }
}

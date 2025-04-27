package behavioral.state;

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
        DocumentContext doc = new DocumentContext();
        UserRole admin = UserRole.ADMIN;
        UserRole editor = UserRole.EDITOR;

        doc.goTo(StateType.MODERATION, editor); // Draft -> Moderation
        println();
        Thread.sleep(1000);

        doc.goTo(StateType.PUBLISHED, editor);  // Moderation -> Published - Not allowed
        println();
        Thread.sleep(1000);

        doc.goTo(StateType.PUBLISHED, admin);   // Moderation -> Published - Admin allowed
        println();
        Thread.sleep(1000);

        doc.goTo(StateType.MODERATION, editor);  // Published -> Moderation
        println();
        Thread.sleep(1000);
    }
}

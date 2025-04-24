package behavioral.state;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DocumentContext doc = new DocumentContext();
        UserRole admin = UserRole.ADMIN;
        UserRole editor = UserRole.EDITOR;

        doc.goTo(StateType.MODERATION, editor); // Draft -> Moderation
        System.out.println();
        Thread.sleep(1000);

        doc.goTo(StateType.PUBLISHED, editor);  // Moderation -> Published - Not allowed
        System.out.println();
        Thread.sleep(1000);

        doc.goTo(StateType.PUBLISHED, admin);   // Moderation -> Published - Admin allowed
        System.out.println();
        Thread.sleep(1000);

        doc.goTo(StateType.MODERATION, editor);  // Published -> Moderation
        System.out.println();
        Thread.sleep(1000);
    }
}

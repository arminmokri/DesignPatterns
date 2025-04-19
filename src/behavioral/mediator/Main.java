package behavioral.mediator;

public class Main {

    private static GuiMediator guiMediator;

    public static void printStatus() throws InterruptedException {
        System.out.println(guiMediator.toString());
        System.out.println();
        System.out.flush();
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {

        guiMediator = new GuiMediator();
        printStatus();

        guiMediator.getLogin().doLogin();
        printStatus();

        guiMediator.getDialog().clickOk();
        printStatus();

        guiMediator.getLogin().setUsernameTextBox("alice");
        guiMediator.getLogin().setPasswordTextBox("abc");
        guiMediator.getLogin().doLogin();
        printStatus();

        guiMediator.getDialog().clickOk();
        printStatus();

        try {
            guiMediator.getDialog().clickOk();
            printStatus();
        } catch (RuntimeException runtimeException) {
            System.err.println("you can not do any action with invisible component");
            System.err.println();
            System.err.flush();
        }

        guiMediator.getLogin().setUsernameTextBox("alice");
        guiMediator.getLogin().setPasswordTextBox("123");
        guiMediator.getLogin().doLogin();
        printStatus();
    }
}

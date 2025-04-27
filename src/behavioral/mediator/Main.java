package behavioral.mediator;

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

        GuiMediator guiMediator;

        guiMediator = new GuiMediator();
        println(guiMediator.toString());
        println();
        Thread.sleep(1000);

        guiMediator.getLogin().doLogin();
        println(guiMediator.toString());
        println();
        Thread.sleep(1000);

        guiMediator.getDialog().clickOk();
        println(guiMediator.toString());
        println();
        Thread.sleep(1000);

        guiMediator.getLogin().setUsernameTextBox("alice");
        guiMediator.getLogin().setPasswordTextBox("abc");
        guiMediator.getLogin().doLogin();
        println(guiMediator.toString());
        println();
        Thread.sleep(1000);

        guiMediator.getDialog().clickOk();
        println(guiMediator.toString());
        println();
        Thread.sleep(1000);

        try {
            guiMediator.getDialog().clickOk();
        } catch (RuntimeException runtimeException) {
            errPrintln("you can not do any action with invisible component");
        } finally {
            println();
            Thread.sleep(1000);
        }

        guiMediator.getLogin().setUsernameTextBox("alice");
        guiMediator.getLogin().setPasswordTextBox("123");
        guiMediator.getLogin().doLogin();
        println(guiMediator.toString());
        println();
        Thread.sleep(1000);
    }
}

package behavioral.memento;

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
        TextEditorOriginator textEditorOriginator = new TextEditorOriginator();
        TextMementoCaretaker textMementoCaretaker = new TextMementoCaretaker();

        textEditorOriginator.type("Hello ");
        textMementoCaretaker.save(textEditorOriginator);

        textEditorOriginator.type("World!");
        textMementoCaretaker.save(textEditorOriginator);

        textEditorOriginator.type(" More text...");

        println("Before undo: '" + textEditorOriginator.getText() + "'");

        textMementoCaretaker.undo(textEditorOriginator);
        println("After 1st undo: '" + textEditorOriginator.getText() + "'");

        textMementoCaretaker.undo(textEditorOriginator);
        println("After 2nd undo: '" + textEditorOriginator.getText() + "'");

        textMementoCaretaker.undo(textEditorOriginator);
        println("After 3rd undo: '" + textEditorOriginator.getText() + "'");
    }
}

package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditorOriginator textEditorOriginator = new TextEditorOriginator();
        TextMementoCaretaker textMementoCaretaker = new TextMementoCaretaker();

        textEditorOriginator.type("Hello ");
        textMementoCaretaker.save(textEditorOriginator);

        textEditorOriginator.type("World!");
        textMementoCaretaker.save(textEditorOriginator);

        textEditorOriginator.type(" More text...");

        System.out.println("Before undo: '" + textEditorOriginator.getText() + "'");

        textMementoCaretaker.undo(textEditorOriginator);
        System.out.println("After 1st undo: '" + textEditorOriginator.getText() + "'");

        textMementoCaretaker.undo(textEditorOriginator);
        System.out.println("After 2nd undo: '" + textEditorOriginator.getText() + "'");

        textMementoCaretaker.undo(textEditorOriginator);
        System.out.println("After 3rd undo: '" + textEditorOriginator.getText() + "'");
    }
}

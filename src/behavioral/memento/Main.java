package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello ");
        history.save(editor);

        editor.type("World!");
        history.save(editor);

        editor.type(" More text...");

        System.out.println("Before undo: '" + editor.getText() + "'");

        history.undo(editor);
        System.out.println("After 1st undo: '" + editor.getText() + "'");

        history.undo(editor);
        System.out.println("After 2nd undo: '" + editor.getText() + "'");

        history.undo(editor);
        System.out.println("After 3rd undo: '" + editor.getText() + "'");
    }
}

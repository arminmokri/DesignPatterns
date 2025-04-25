package behavioral.memento;

import java.util.Stack;

public class History {
    private final Stack<TextMemento> backups = new Stack<>();

    public void save(TextEditor editor) {
        backups.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!backups.isEmpty()) {
            editor.restore(backups.pop());
        }
    }
}

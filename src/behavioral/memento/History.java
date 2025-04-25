package behavioral.memento;

import java.util.Stack;

public class History {
    private final Stack<TextMemento> backups = new Stack<>();

    public void save(TextEditor editor) {
        TextMemento textMemento = editor.save();
        backups.push(textMemento);
    }

    public void undo(TextEditor editor) {
        if (!backups.isEmpty()) {
            TextMemento textMemento = backups.pop();
            editor.restore(textMemento);
        }
    }
}

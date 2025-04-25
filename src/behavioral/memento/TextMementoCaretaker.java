package behavioral.memento;

import java.util.Stack;

public class TextMementoCaretaker {
    private final Stack<TextMemento> backups = new Stack<>();

    public void save(TextEditorOriginator editor) {
        TextMemento textMemento = editor.save();
        backups.push(textMemento);
    }

    public void undo(TextEditorOriginator editor) {
        if (!backups.isEmpty()) {
            TextMemento textMemento = backups.pop();
            editor.restore(textMemento);
        }
    }
}

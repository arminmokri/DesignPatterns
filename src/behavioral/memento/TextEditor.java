package behavioral.memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void type(String words) {
        text.append(words);
    }

    public String getText() {
        return text.toString();
    }

    public TextMemento save() {
        return new TextMemento(text.toString());
    }

    public void restore(TextMemento memento) {
        this.text = new StringBuilder(memento.getText());
    }
}

package behavioral.command;

public interface Command {

    Boolean execute();

    void undo();
}

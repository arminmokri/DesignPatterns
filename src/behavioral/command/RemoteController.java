package behavioral.command;

import java.util.Stack;

public class RemoteController {

    private final Stack<Command> commandHistory;

    public RemoteController() {
        this.commandHistory = new Stack<>();
    }

    public void pressButton(Command command) {
        if (command.execute()) {
            this.commandHistory.add(command);
        }
    }

    public void pressUndo() {
        if (!this.commandHistory.isEmpty()) {
            this.commandHistory.pop().undo();
        } else {
            Main.println("Nothing for undo");
        }
    }

    public void clearCommandHistory() {
        this.commandHistory.clear();
    }
}

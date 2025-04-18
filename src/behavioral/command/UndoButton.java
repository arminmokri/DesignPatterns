package behavioral.command;

public record UndoButton(RemoteController remoteController) implements Command {

    @Override
    public Boolean execute() {
        remoteController.pressUndo();
        return Boolean.FALSE;
    }

    @Override
    public void undo() {
        return;
    }
}

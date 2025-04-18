package behavioral.command;

public class PowerButton implements Command {

    private final RemoteController remoteController;

    private final Power power;
    private String actionMessage;

    public PowerButton(RemoteController remoteController) {
        this.remoteController = remoteController;
        this.power = Power.getInstance();
    }

    @Override
    public Boolean execute() {
        if (this.power.toggle()) {
            this.actionMessage = "Air conditioner is turn on";
        } else {
            this.actionMessage = "Air conditioner is turn off";
            this.remoteController.clearCommandHistory();
        }
        System.out.println(this.actionMessage);
        System.out.flush();
        return Boolean.TRUE;
    }

    @Override
    public void undo() {
        this.power.toggle();
        System.out.println("Undo, " + this.actionMessage);
        System.out.flush();
    }
}

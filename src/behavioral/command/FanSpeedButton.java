package behavioral.command;

public class FanSpeedButton implements Command {

    private final FanSpeed fanSpeed;

    private String actionMessage;

    public FanSpeedButton() {
        this.fanSpeed = FanSpeed.getInstance();
    }

    @Override
    public Boolean execute() {
        String fromSpeed = this.fanSpeed.getCurrentSpeed();
        String toSpeed = this.fanSpeed.next();
        this.actionMessage = "Fan Speed from '" + fromSpeed + "' changed to '" + toSpeed + "'";
        System.out.println(this.actionMessage);
        System.out.flush();
        return Boolean.TRUE;
    }

    @Override
    public void undo() {
        this.fanSpeed.previous();
        System.out.println("Undo, " + this.actionMessage);
        System.out.flush();
    }

}

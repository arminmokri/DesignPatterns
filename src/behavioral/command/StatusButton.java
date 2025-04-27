package behavioral.command;

public class StatusButton implements Command {

    private final Power power;
    private final Temperature temperature;
    private final FanSpeed fanSpeed;

    public StatusButton() {
        this.power = Power.getInstance();
        this.temperature = Temperature.getInstance();
        this.fanSpeed = FanSpeed.getInstance();
    }

    @Override
    public Boolean execute() {
        Main.println("Status {" + this.power.toString() + ", " + this.temperature.toString() + ", " + this.fanSpeed.toString() + "}");
        return Boolean.FALSE;
    }

    @Override
    public void undo() {
        return;
    }
}



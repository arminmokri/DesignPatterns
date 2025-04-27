package behavioral.command;

public class TemperatureDownButton implements Command {

    private final Temperature temperature;
    private String actionMessage;

    public TemperatureDownButton() {
        this.temperature = Temperature.getInstance();
    }

    @Override
    public Boolean execute() {
        Integer currentTemp = this.temperature.getCurrentTemp();
        Integer newTemp = this.temperature.tempDown();
        if (!currentTemp.equals(newTemp)) {
            this.actionMessage = "Temperature from '" + currentTemp + "' decreased to '" + newTemp + "'";
            Main.println(this.actionMessage);
            return Boolean.TRUE;
        } else {
            Main.errPrintln("Temperature '" + newTemp + "' is already min");
            return Boolean.FALSE;
        }

    }

    @Override
    public void undo() {
        this.temperature.tempUp();
        Main.println("Undo, " + this.actionMessage);
    }
}

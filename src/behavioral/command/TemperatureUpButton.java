package behavioral.command;

public class TemperatureUpButton implements Command {

    private final Temperature temperature;
    private String actionMessage;

    public TemperatureUpButton() {
        this.temperature = Temperature.getInstance();
    }

    @Override
    public Boolean execute() {
        Integer currentTemp = this.temperature.getCurrentTemp();
        Integer newTemp = this.temperature.tempUp();
        if (!currentTemp.equals(newTemp)) {
            this.actionMessage = "Temperature from '" + currentTemp + "' increased to '" + newTemp + "'";
            Main.println(this.actionMessage);
            return Boolean.TRUE;
        } else {
            Main.errPrintln("Temperature '" + newTemp + "' is already max");
            return Boolean.FALSE;
        }
    }

    @Override
    public void undo() {
        this.temperature.tempDown();
        Main.println("Undo, " + this.actionMessage);
    }
}

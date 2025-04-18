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
            System.out.println(this.actionMessage);
            System.out.flush();
            return Boolean.TRUE;
        } else {
            System.err.println("Temperature '" + newTemp + "' is already min");
            System.err.flush();
            return Boolean.FALSE;
        }

    }

    @Override
    public void undo() {
        this.temperature.tempUp();
        System.out.println("Undo, " + this.actionMessage);
        System.out.flush();
    }
}

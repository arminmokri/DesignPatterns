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
            System.out.println(this.actionMessage);
            System.out.flush();
            return Boolean.TRUE;
        } else {
            System.err.println("Temperature '" + newTemp + "' is already max");
            System.err.flush();
            return Boolean.FALSE;
        }
    }

    @Override
    public void undo() {
        this.temperature.tempDown();
        System.out.println("Undo, " + this.actionMessage);
        System.out.flush();
    }
}

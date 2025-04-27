package structural.adapter;

public class EUPowerSocket implements PowerSocket {

    private final static Integer providedVoltage = 220;

    public EUPowerSocket() {
    }

    @Override
    public Integer provideVoltage() {
        Main.println("Providing " + providedVoltage + "V from EU socket");
        return providedVoltage;
    }
}

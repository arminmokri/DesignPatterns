package structural.adapter;

public class EUPowerSocket {

    private final static Integer providedVoltage = 220;

    public EUPowerSocket() {
    }

    public Integer provide220V() {
        System.out.println("Providing " + providedVoltage + "V from EU socket");
        System.out.flush();
        return providedVoltage;
    }
}

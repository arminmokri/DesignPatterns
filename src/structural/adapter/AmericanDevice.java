package structural.adapter;

public class AmericanDevice implements PlugInDevice {

    private final static Integer neededVoltage = 110;

    private final USPowerSocket socket;
    private Boolean powered;

    public AmericanDevice(USPowerSocket socket) {
        this.socket = socket;
        this.powered = Boolean.FALSE;
    }

    @Override
    public void plugIn() {
        if (!powered) {
            Integer voltage = socket.provide110V();
            if (voltage.equals(neededVoltage)) {
                powered = Boolean.TRUE;
                System.out.println("American device is working safely on " + voltage + "V");
                System.out.flush();
            } else if (voltage.equals(0)) {
                System.err.println("American device no voltage in socket");
                System.err.flush();
            } else {
                System.err.println("American device unsafe voltage!");
                System.err.flush();
            }
        } else {
            System.err.println("American device is already turn on");
            System.err.flush();
        }
    }

    @Override
    public void Unplug() {
        if (powered) {
            powered = Boolean.FALSE;
            System.out.println("American device is turn off");
            System.out.flush();
        } else {
            System.err.println("American device is already turn off");
            System.err.flush();
        }
    }

    @Override
    public Boolean isPowered() {
        return powered;
    }
}

package structural.adapter;

public class VoltageAdapter implements USPowerSocket, PlugInDevice {

    private final static Integer sourceVoltage = 220;
    private final static Integer finalVoltage = 110;

    private final EUPowerSocket euSocket;
    private Boolean powered;

    public VoltageAdapter(EUPowerSocket euSocket) {
        this.euSocket = euSocket;
        powered = Boolean.FALSE;
    }

    @Override
    public void plugIn() {
        if (!powered) {
            Integer voltage = euSocket.provide220V();
            if (voltage.equals(sourceVoltage)) {
                powered = Boolean.TRUE;
                System.out.println("Voltage adapter plugged into EU socket and powered on");
            } else if (voltage.equals(0)) {
                System.err.println("Voltage adapter no voltage in socket");
                System.err.flush();
            } else {
                System.err.println("Voltage adapter voltage unsupported");
                System.err.flush();
            }
        } else {
            System.err.println("Voltage adapter is already turn on");
            System.err.flush();
        }
    }

    @Override
    public void Unplug() {
        if (powered) {
            powered = Boolean.FALSE;
            System.out.println("Voltage adapter is turn off");
            System.out.flush();
        } else {
            System.err.println("Voltage adapter is already turn off");
            System.err.flush();
        }
    }

    @Override
    public Boolean isPowered() {
        return powered;
    }

    @Override
    public Integer provide110V() {
        Integer steppedDown;
        if (powered) {
            steppedDown = finalVoltage;
            System.out.println("Adapter: Converting to " + steppedDown + "V");
        } else {
            steppedDown = 0;
        }
        return steppedDown;
    }
}

package structural.adapter;

public class VoltageAdapter implements PowerSocket, PlugInDevice {

    private final static Integer neededVoltage = 220;
    private final static Integer finalVoltage = 110;

    private final EUPowerSocket euSocket;
    private Boolean powered;

    public VoltageAdapter(EUPowerSocket euSocket) {
        this.euSocket = euSocket;
        powered = Boolean.FALSE;
    }

    @Override
    public Integer neededVoltage() {
        return neededVoltage;
    }

    @Override
    public void plugIn() {
        if (!powered) {
            Integer provideVoltage = euSocket.provideVoltage();
            if (provideVoltage.equals(neededVoltage())) {
                powered = Boolean.TRUE;
                Main.println("Voltage adapter plugged into EU socket and powered on");
            } else if (provideVoltage.equals(0)) {
                Main.errPrintln("Voltage adapter no voltage in socket");
            } else {
                Main.errPrintln("Voltage adapter voltage unsupported");
            }
        } else {
            Main.errPrintln("Voltage adapter is already turn on");
        }
    }

    @Override
    public void Unplug() {
        if (powered) {
            powered = Boolean.FALSE;
            Main.println("Voltage adapter is turn off");
        } else {
            Main.errPrintln("Voltage adapter is already turn off");
        }
    }

    @Override
    public Boolean isPowered() {
        return powered;
    }

    @Override
    public Integer provideVoltage() {
        Integer steppedDown;
        if (powered) {
            steppedDown = finalVoltage;
            Main.println("Adapter: Converting to " + steppedDown + "V");
        } else {
            steppedDown = 0;
        }
        return steppedDown;
    }
}

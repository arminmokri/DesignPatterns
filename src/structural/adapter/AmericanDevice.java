package structural.adapter;

public class AmericanDevice implements PlugInDevice {

    private final static Integer neededVoltage = 110;
    private final PowerSocket socket;
    private Boolean powered;

    public AmericanDevice(PowerSocket socket) {
        this.socket = socket;
        this.powered = Boolean.FALSE;
    }

    @Override
    public Integer neededVoltage() {
        return neededVoltage;
    }

    @Override
    public void plugIn() {
        if (!powered) {
            Integer provideVoltage = socket.provideVoltage();
            if (provideVoltage.equals(neededVoltage())) {
                powered = Boolean.TRUE;
                Main.println("American device is working safely on " + provideVoltage + "V");
            } else if (provideVoltage.equals(0)) {
                Main.errPrintln("American device no voltage in socket");
            } else {
                Main.errPrintln("American device unsafe voltage!");
            }
        } else {
            Main.errPrintln("American device is already turn on");
        }
    }

    @Override
    public void Unplug() {
        if (powered) {
            powered = Boolean.FALSE;
            Main.println("American device is turn off");
        } else {
            Main.errPrintln("American device is already turn off");
        }
    }

    @Override
    public Boolean isPowered() {
        return powered;
    }
}

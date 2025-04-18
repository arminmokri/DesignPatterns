package behavioral.command;

import java.util.Objects;

public class Power {

    private static Power power;

    private Boolean isOn;

    private Power() {
        this.isOn = Boolean.FALSE;
    }

    public static Power getInstance() {
        if (Objects.isNull(power)) {
            synchronized (Power.class) {
                if (Objects.isNull(power)) {
                    power = new Power();
                }
            }
        }
        return power;
    }

    public Boolean toggle() {
        this.isOn = !this.isOn;
        return this.isOn;
    }

    @Override
    public String toString() {
        String state = this.isOn ? "is on" : "is off";
        return "Air conditioner " + state;
    }
}

package behavioral.command;

import java.util.Objects;

public class FanSpeed {
    private final static String[] SPEEDS = {"LOW", "MEDIUM", "HIGH"};

    private static FanSpeed fanSpeed;

    private Integer currentSpeed;

    private FanSpeed() {
        this.currentSpeed = 1;
    }

    public static FanSpeed getInstance() {
        if (Objects.isNull(fanSpeed)) {
            synchronized (FanSpeed.class) {
                if (Objects.isNull(fanSpeed)) {
                    fanSpeed = new FanSpeed();
                }
            }
        }
        return fanSpeed;
    }

    public String getCurrentSpeed() {
        return SPEEDS[this.currentSpeed];
    }


    public String next() {
        this.currentSpeed = Math.floorMod(this.currentSpeed + 1, SPEEDS.length);
        return getCurrentSpeed();
    }

    public String previous() {
        this.currentSpeed = Math.floorMod(this.currentSpeed - 1, SPEEDS.length);
        return getCurrentSpeed();
    }

    @Override
    public String toString() {
        return "Fan speed is set on '" + getCurrentSpeed() + "'";
    }
}


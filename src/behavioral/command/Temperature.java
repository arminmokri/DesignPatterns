package behavioral.command;

import java.util.Objects;

public class Temperature {

    private final static Integer MIN = 16;
    private final static Integer MAX = 32;

    private static Temperature temperature;

    private Integer currentTemp;

    private Temperature() {
        this.currentTemp = 25;
    }

    public static Temperature getInstance() {
        if (Objects.isNull(temperature)) {
            synchronized (Temperature.class) {
                if (Objects.isNull(temperature)) {
                    temperature = new Temperature();
                }
            }
        }
        return temperature;
    }

    public synchronized int getCurrentTemp() {
        return currentTemp;
    }

    public synchronized Integer tempUp() {
        if (this.currentTemp + 1 <= Temperature.MAX) {
            this.currentTemp++;
        }
        return this.currentTemp;
    }

    public synchronized Integer tempDown() {
        if (this.currentTemp + 1 >= Temperature.MIN) {
            this.currentTemp--;
        }
        return this.currentTemp;
    }

    @Override
    public String toString() {
        return "Temperature is set on '" + currentTemp + "'";
    }
}

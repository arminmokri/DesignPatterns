package structural.adapter;

public interface PlugInDevice {

    Integer neededVoltage();

    void plugIn();

    void Unplug();

    Boolean isPowered();
}

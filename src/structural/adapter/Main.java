package structural.adapter;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // We are in Europe
        EUPowerSocket euSocket = new EUPowerSocket();

        // Plug adapter into EU socket
        VoltageAdapter adapter = new VoltageAdapter(euSocket);
        adapter.plugIn(); // Adapter powers itself from 220V
        System.out.println();
        Thread.sleep(1000);

        // Now use adapter to power US device
        AmericanDevice usDevice = new AmericanDevice(adapter);
        usDevice.plugIn();
        System.out.println();
        Thread.sleep(1000);
    }
}

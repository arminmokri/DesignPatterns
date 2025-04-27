package structural.adapter;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

    public static void main(String[] args) throws InterruptedException {

        // We are in Europe
        EUPowerSocket euSocket = new EUPowerSocket();

        // Plug adapter into EU socket
        VoltageAdapter adapter = new VoltageAdapter(euSocket);
        adapter.plugIn(); // Adapter powers itself from 220V
        println();
        Thread.sleep(1000);

        // Use eu Socket to power US device
        AmericanDevice usDevice = new AmericanDevice(euSocket);
        usDevice.plugIn();
        println();
        Thread.sleep(1000);

        // Now use adapter to power US device
        usDevice = new AmericanDevice(adapter);
        usDevice.plugIn();
        println();
        Thread.sleep(1000);
    }
}

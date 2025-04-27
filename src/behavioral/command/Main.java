package behavioral.command;

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

        RemoteController remoteController = new RemoteController();

        Command[] commands = {
                new UndoButton(remoteController), // undo *(noting for undo)
                new PowerButton(remoteController), // turn on
                new TemperatureUpButton(), // 25 -> 26
                new TemperatureUpButton(), // 26 -> 27
                new TemperatureUpButton(), // 27 -> 28
                new TemperatureUpButton(), // 28 -> 29
                new TemperatureUpButton(), // 29 -> 30
                new TemperatureUpButton(), // 30 -> 31
                new TemperatureUpButton(), // 31 -> 32 *A
                new TemperatureUpButton(), // it is max(32)
                new StatusButton(),
                new UndoButton(remoteController), // undo *A (32 -> 31)
                new StatusButton(),
                new TemperatureDownButton(), // 31 -> 30
                new FanSpeedButton(), // medium -> high
                new FanSpeedButton(), // high -> low *B
                new UndoButton(remoteController), // undo *B (low -> high)
                new StatusButton(),
                new PowerButton(remoteController), // turn off
        };

        for (Command command : commands) {
            remoteController.pressButton(command);
            Thread.sleep(1000);
        }


    }
}

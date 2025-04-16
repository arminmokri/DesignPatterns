package creational.singleton;

import java.util.Objects;

public class ThreadUnsafePrinter implements Printer {

    private static ThreadUnsafePrinter printer;

    private ThreadUnsafePrinter() {
    }

    public static ThreadUnsafePrinter getInstance() {
        if (Objects.isNull(printer)) {
            printer = new ThreadUnsafePrinter();
        }
        return printer;
    }

    @Override
    public void print(String text) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(75);
            }
            System.out.println();
            Thread.sleep(1000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

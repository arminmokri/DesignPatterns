package creational.singleton;

import java.util.Objects;

public class ThreadSafePrinter implements Printer {

    private static ThreadSafePrinter printer;

    private ThreadSafePrinter() {
    }

    public static ThreadSafePrinter getInstance() {
        if (Objects.isNull(printer)) {
            synchronized (ThreadSafePrinter.class) {
                if (Objects.isNull(printer)) {
                    printer = new ThreadSafePrinter();
                }
            }
        }

        return printer;
    }

    @Override
    public synchronized void print(String text) {
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

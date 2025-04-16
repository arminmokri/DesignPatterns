package creational.singleton;

import java.util.Objects;

public class ThreadSafeSingleton implements Printer {

    private static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (Objects.isNull(singleton)) {
            synchronized (ThreadSafeSingleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new ThreadSafeSingleton();
                }
            }
        }

        return singleton;
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

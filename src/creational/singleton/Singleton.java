package creational.singleton;

import java.util.Objects;

public class Singleton implements Printer {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
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

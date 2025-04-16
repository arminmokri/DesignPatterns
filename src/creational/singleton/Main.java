package creational.singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Thread Safe singleton printer

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                Printer printer = ThreadSafeSingleton.getInstance();
                printer.print("Thread Safe Printer A is running.");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                Printer printer = ThreadSafeSingleton.getInstance();
                printer.print("Thread Safe Printer B is running.");
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        // Regular singleton printer

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                Printer printer = Singleton.getInstance();
                printer.print("Regular Printer C is running.");
            }
        });

        threadC.start();

        threadC.join();

        // Thread Unsafe singleton printer

        Thread threadD = new Thread(new Runnable() {
            @Override
            public void run() {
                Printer printer = Singleton.getInstance();
                printer.print("Thread Unsafe Printer D is running.");
            }
        });

        Thread threadE = new Thread(new Runnable() {
            @Override
            public void run() {
                Printer printer = Singleton.getInstance();
                printer.print("Thread Unsafe Printer E is running.");
            }
        });

        threadD.start();
        threadE.start();

        threadD.join();
        threadE.join();

    }
}

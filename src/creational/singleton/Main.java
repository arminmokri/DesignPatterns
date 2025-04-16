package creational.singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Thread Safe singleton printer

        Thread threadA = new Thread(() -> {
            Printer printer = ThreadSafePrinter.getInstance();
            printer.print("Thread Safe Printer A is running fine.");
        });

        Thread threadB = new Thread(() -> {
            Printer printer = ThreadSafePrinter.getInstance();
            printer.print("Thread Safe Printer B is running fine.");
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        // if you don't have multithreading Thread Unsafe singleton printer is fine

        Thread threadC = new Thread(() -> {
            Printer printer = ThreadUnsafePrinter.getInstance();
            printer.print("Thread Unsafe Printer C is running fine.");
        });

        threadC.start();

        threadC.join();

        // but if you have multithreading Thread Unsafe singleton printer is wrong

        Thread threadD = new Thread(() -> {
            Printer printer = ThreadUnsafePrinter.getInstance();
            printer.print("Thread Unsafe Printer D is running wrong.");
        });

        Thread threadE = new Thread(() -> {
            Printer printer = ThreadUnsafePrinter.getInstance();
            printer.print("Thread Unsafe Printer E is running wrong.");
        });

        threadD.start();
        threadE.start();

        threadD.join();
        threadE.join();

    }
}

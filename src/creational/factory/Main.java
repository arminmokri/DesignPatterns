package creational.factory;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PastryFactory factory = new PastryFactory();

        Pastry cake = factory.createPastry("cake");
        cake.prepare();
        System.out.println();
        Thread.sleep(1000);

        Pastry croissant = factory.createPastry("croissant");
        croissant.prepare();
        System.out.println();
        Thread.sleep(1000);

        try {
            Pastry cakeYazdi = factory.createPastry("cake-yazdi");
            cakeYazdi.prepare();

        } catch (RuntimeException runtimeException) {
            System.err.println(runtimeException.getMessage());
            System.err.println();
            System.err.flush();
            Thread.sleep(1000);
        }

        Pastry muffin = factory.createPastry("muffin");
        muffin.prepare();
        System.out.println();
        Thread.sleep(1000);

    }
}

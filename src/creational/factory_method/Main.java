package creational.factory_method;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PastryFactory cakeFactory = new CakeFactory();
        cakeFactory.orderPastry();
        System.out.println();
        Thread.sleep(1000);

        PastryFactory croissantFactory = new CroissantFactory();
        croissantFactory.orderPastry();
        System.out.println();
        Thread.sleep(1000);

        PastryFactory muffinFactory = new MuffinFactory();
        muffinFactory.orderPastry();
        System.out.println();
        Thread.sleep(1000);

    }
}

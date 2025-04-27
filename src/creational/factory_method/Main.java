package creational.factory_method;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Pastry cakePastry = new CakePastry();
        cakePastry.orderItem();
        System.out.println();
        Thread.sleep(1000);

        Pastry croissantPastry = new CroissantPastry();
        croissantPastry.orderItem();
        System.out.println();
        Thread.sleep(1000);

        Pastry muffinPastry = new MuffinPastry();
        muffinPastry.orderItem();
        System.out.println();
        Thread.sleep(1000);

    }
}

package structural.decorator;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // my favorite one
        Waffle waffle1 = new RegularWaffle();
        waffle1 = new Banana(waffle1);
        waffle1 = new Strawberry(waffle1);
        waffle1 = new PeanutButter(waffle1);
        System.out.println(waffle1.getDescription());
        System.out.println("Total: $" + waffle1.getCost());
        System.out.println();
        System.out.flush();
        Thread.sleep(2000);

        Waffle waffle2 = new RegularWaffle();
        waffle2 = new Banana(waffle2);
        waffle2 = new MapleSyrup(waffle2);
        waffle2 = new Nutella(waffle2);
        System.out.println(waffle2.getDescription());
        System.out.println("Total: $" + waffle2.getCost());
        System.out.println();
        System.out.flush();
        Thread.sleep(2000);
    }
}

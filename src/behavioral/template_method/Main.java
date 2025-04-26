package behavioral.template_method;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BeverageMaker tea = new TeaMaker();
        BeverageMaker coffee = new CoffeeMaker();

        System.out.println("Making tea:");
        tea.makeBeverage();
        System.out.println();
        Thread.sleep(2000);

        System.out.println("Making coffee:");
        coffee.makeBeverage();
        System.out.println();
        Thread.sleep(2000);
    }
}

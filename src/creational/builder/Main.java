package creational.builder;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

    public static void main(String[] args) throws InterruptedException {

        Bicycle myBike = new Bicycle.Builder("M", 26, "Black")
                .frameMaterial("Aluminum")
                .brakeType("Hydraulic")
                .gearCount(30)
                .tireType("MTB")
                .suspensionType("Full")
                .handlebarType("Riser")
                .hasBell(true)
                .hasCarrier(false)
                .seatType("Racing")
                .hasLights(true)
                .hasKickstand(false)
                .weight(12)
                .build();

        println(myBike.toString());
        println();
        Thread.sleep(2000);

        Car myCar = Car.builder("Renault")
                .model("L90")
                .year(1398)
                .build();

        println(myCar.toString());
        println();
    }
}

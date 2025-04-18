package creational.builder;

public class Main {

    public static void main(String[] args) {

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

        System.out.println(myBike.toString());
        System.out.println();

        Car myCar = Car.builder("Renault")
                .model("L90")
                .year(1398)
                .build();

        System.out.println(myCar.toString());
    }
}

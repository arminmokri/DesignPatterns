package creational.builder;

public class Bicycle {
    // Required fields
    private final String frameSize;
    private final int wheelSize;
    private final String color;

    // Optional fields
    private final String frameMaterial;
    private final String brakeType;
    private final int gearCount;
    private final String tireType;
    private final String suspensionType;
    private final String handlebarType;
    private final boolean hasBell;
    private final boolean hasCarrier;
    private final String seatType;
    private final boolean hasLights;
    private final boolean hasKickstand;
    private final double weight;

    private Bicycle(Builder builder) {
        this.frameSize = builder.frameSize;
        this.wheelSize = builder.wheelSize;
        this.color = builder.color;
        this.frameMaterial = builder.frameMaterial;
        this.brakeType = builder.brakeType;
        this.gearCount = builder.gearCount;
        this.tireType = builder.tireType;
        this.suspensionType = builder.suspensionType;
        this.handlebarType = builder.handlebarType;
        this.hasBell = builder.hasBell;
        this.hasCarrier = builder.hasCarrier;
        this.seatType = builder.seatType;
        this.hasLights = builder.hasLights;
        this.hasKickstand = builder.hasKickstand;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "frameSize='" + frameSize + '\'' +
                ", wheelSize=" + wheelSize +
                ", color='" + color + '\'' +
                ", frameMaterial='" + frameMaterial + '\'' +
                ", brakeType='" + brakeType + '\'' +
                ", gearCount=" + gearCount +
                ", tireType='" + tireType + '\'' +
                ", suspensionType='" + suspensionType + '\'' +
                ", handlebarType='" + handlebarType + '\'' +
                ", hasBell=" + hasBell +
                ", hasCarrier=" + hasCarrier +
                ", seatType='" + seatType + '\'' +
                ", hasLights=" + hasLights +
                ", hasKickstand=" + hasKickstand +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        // Required
        private final String frameSize;
        private final int wheelSize;
        private final String color;

        // Optional - with default values
        private String frameMaterial = "Aluminum";
        private String brakeType = "Rim";
        private int gearCount = 1;
        private String tireType = "Road";
        private String suspensionType = "None";
        private String handlebarType = "Flat";
        private boolean hasBell = false;
        private boolean hasCarrier = false;
        private String seatType = "Comfort";
        private boolean hasLights = false;
        private boolean hasKickstand = false;
        private double weight = 10.0;

        // Builder constructor with required fields
        public Builder(String frameSize, int wheelSize, String color) {
            this.frameSize = frameSize;
            this.wheelSize = wheelSize;
            this.color = color;
        }

        // Optional setters
        public Builder frameMaterial(String frameMaterial) {
            this.frameMaterial = frameMaterial;
            return this;
        }

        public Builder brakeType(String brakeType) {
            this.brakeType = brakeType;
            return this;
        }

        public Builder gearCount(int gearCount) {
            this.gearCount = gearCount;
            return this;
        }

        public Builder tireType(String tireType) {
            this.tireType = tireType;
            return this;
        }

        public Builder suspensionType(String suspensionType) {
            this.suspensionType = suspensionType;
            return this;
        }

        public Builder handlebarType(String handlebarType) {
            this.handlebarType = handlebarType;
            return this;
        }

        public Builder hasBell(boolean hasBell) {
            this.hasBell = hasBell;
            return this;
        }

        public Builder hasCarrier(boolean hasCarrier) {
            this.hasCarrier = hasCarrier;
            return this;
        }

        public Builder seatType(String seatType) {
            this.seatType = seatType;
            return this;
        }

        public Builder hasLights(boolean hasLights) {
            this.hasLights = hasLights;
            return this;
        }

        public Builder hasKickstand(boolean hasKickstand) {
            this.hasKickstand = hasKickstand;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Bicycle build() {
            return new Bicycle(this);
        }
    }
}

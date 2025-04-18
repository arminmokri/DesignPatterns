package creational.builder;

public class Car {

    // Required fields
    private final String brand;

    // Optional fields
    private final String model;
    private final Integer year;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static Builder builder(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand is required");
        }
        return new Builder(brand);
    }

    public static class Builder {

        // Required
        private final String brand;

        // Optional - with default values
        private String model = "L90";
        private Integer year = 1398;

        private Builder(String brand) {
            this.brand = brand;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

package ovh.neziw.patterns;

public class Car {

    private final String engine;
    private final int seats;

    public Car(final Builder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + this.engine + '\'' +
                ", seats=" + this.seats +
                '}';
    }

    public static class Builder {

        private String engine;
        private int seats;

        public Builder engine(final String engine) {
            this.engine = engine;
            return this;
        }

        public Builder seats(final int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class BuilderExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderExample.class);

    public static void main(final String[] args) {
        final Car car = new Car.Builder()
                .engine("V8")
                .seats(5)
                .build();
        LOGGER.info("Car created: {}", car.toString());
    }
}
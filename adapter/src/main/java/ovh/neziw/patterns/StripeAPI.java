package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class StripeAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(StripeAPI.class);

    public void authenticate(final String apiKey) {
        LOGGER.info("Authenticated with Stripe API using API key: {}", apiKey);
    }

    public void charge(final double amount) {
        LOGGER.info("Charged {} using the Stripe API", amount);
    }
}
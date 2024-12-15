package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PayPalAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(PayPalAPI.class);

    public void loginToPayPal(final String email, final String ignoredPassword) {
        LOGGER.info("Logged into PayPal with email: {}", email);
    }

    public void sendPayment(final double amount) {
        LOGGER.info("Sent payment of ${} to PayPal", amount);
    }
}
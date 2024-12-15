package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class AdapterExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdapterExample.class);

    public static void main(final String[] args) {
        final PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalAPI());
        final PaymentProcessor stripeProcessor = new StripeAdapter(new StripeAPI());

        LOGGER.info("Processing payments...");
        payPalProcessor.processPayment(50.0); // Use PayPal
        stripeProcessor.processPayment(100.0); // Use Stripe
    }
}
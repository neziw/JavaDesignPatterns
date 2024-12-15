package ovh.neziw.patterns;

class StripeAdapter implements PaymentProcessor {

    private final StripeAPI stripeAPI;

    protected StripeAdapter(final StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public void processPayment(final double amount) {
        this.stripeAPI.authenticate("stripe_secret_key");
        this.stripeAPI.charge(amount);
    }
}
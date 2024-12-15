package ovh.neziw.patterns;

class PayPalAdapter implements PaymentProcessor {

    private final PayPalAPI payPalAPI;

    protected PayPalAdapter(final PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void processPayment(final double amount) {
        this.payPalAPI.loginToPayPal("user@example.com", "password");
        this.payPalAPI.sendPayment(amount);
    }
}
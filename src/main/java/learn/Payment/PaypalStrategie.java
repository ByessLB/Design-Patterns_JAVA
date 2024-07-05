package learn.Payment;

public class PaypalStrategie implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by Paypal");
    }
}

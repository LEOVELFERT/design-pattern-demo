package creational.ocp.bad;

public class PaymentProcessor {


    public void payment(String paymentType) {
        if ("creditCard".equalsIgnoreCase(paymentType)) {
            //business logic
        } else if ("debit card".equalsIgnoreCase(paymentType)) {
            //business loic
        } else if ("paypal".equalsIgnoreCase(paymentType)) {
            //buiness logic
        } else {
            throw new RuntimeException("invalid payment");
        }
    }
}

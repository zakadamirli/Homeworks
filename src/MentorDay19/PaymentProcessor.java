package MentorDay19;

public class PaymentProcessor {

    public void processPayment(double paymentAmount, double totalAmount) throws PaymentProcessingException {
        if (paymentAmount < totalAmount) {
            throw new PaymentProcessingException("Payment amount is insufficient. Required: " + totalAmount + ", provided: " + paymentAmount);
        }
        System.out.println("Payment processed successfully!");
    }
}

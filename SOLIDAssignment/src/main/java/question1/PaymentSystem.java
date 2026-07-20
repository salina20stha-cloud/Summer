package question1;

public class PaymentSystem {

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {

        PaymentSystem paymentSystem = new PaymentSystem();

        paymentSystem.processPayment(new EsewaPayment(), 1000);
        paymentSystem.processPayment(new KhaltiPayment(), 2000);
        paymentSystem.processPayment(new CardPayment(), 3000);
    }
}
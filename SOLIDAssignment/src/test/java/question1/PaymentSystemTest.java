package question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PaymentSystemTest {

    @Test
    void testEsewaPayment() {
        PaymentSystem system = new PaymentSystem();

        assertDoesNotThrow(() ->
                system.processPayment(new EsewaPayment(), 1000));
    }

    @Test
    void testKhaltiPayment() {
        PaymentSystem system = new PaymentSystem();

        assertDoesNotThrow(() ->
                system.processPayment(new KhaltiPayment(), 2000));
    }

    @Test
    void testCardPayment() {
        PaymentSystem system = new PaymentSystem();

        assertDoesNotThrow(() ->
                system.processPayment(new CardPayment(), 3000));
    }
}
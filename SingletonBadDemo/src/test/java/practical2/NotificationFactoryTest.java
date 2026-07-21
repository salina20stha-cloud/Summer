package practical2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NotificationFactoryTest {

    @Test
    void testEmailNotificationCreated() {

        Notification notification = NotificationFactory.createNotification("EMAIL");

        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void testSMSNotificationCreated() {

        Notification notification = NotificationFactory.createNotification("SMS");

        assertTrue(notification instanceof SMSNotification);
    }

    @Test
    void testPushNotificationCreated() {

        Notification notification = NotificationFactory.createNotification("PUSH");

        assertTrue(notification instanceof PushNotification);
    }

    @Test
    void testNotificationNotNull() {

        Notification notification = NotificationFactory.createNotification("EMAIL");

        assertNotNull(notification);
    }

    @Test
    void testInvalidNotificationThrowsException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> NotificationFactory.createNotification("WHATSAPP")
        );
    }
}
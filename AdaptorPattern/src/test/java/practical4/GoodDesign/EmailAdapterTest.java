package practical4.GoodDesign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmailAdapterTest {

    @Test
    void testAdapterObjectCreated() {

        EmailAdapter adapter = new EmailAdapter();

        assertNotNull(adapter);

    }

    @Test
    void testNotificationSentSuccessfully() {

        EmailAdapter adapter = new EmailAdapter();

        assertDoesNotThrow(() ->
                adapter.send("Assignment Uploaded"));

    }

    @Test
    void testAdapterDelegatesRequestCorrectly() {

        EmailAdapter adapter = new EmailAdapter();

        assertDoesNotThrow(() ->
                adapter.send("Exam starts tomorrow"));

    }

    @Test
    void testNotificationClientCreated() {

        NotificationClient client =
                new NotificationClient(new EmailAdapter());

        assertNotNull(client);

    }

}
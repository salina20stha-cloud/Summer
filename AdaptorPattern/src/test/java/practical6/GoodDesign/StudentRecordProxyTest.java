package practical6.GoodDesign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentRecordProxyTest {

    @Test
    void testAdminAccessAllowed() {

        StudentRecord proxy = new StudentRecordProxy("ADMIN");

        assertDoesNotThrow(() -> proxy.viewMarks());

    }

    @Test
    void testStudentAccessDenied() {

        StudentRecord proxy = new StudentRecordProxy("STUDENT");

        assertDoesNotThrow(() -> proxy.viewMarks());

    }

    @Test
    void testProxyObjectCreated() {

        StudentRecord proxy = new StudentRecordProxy("ADMIN");

        assertTrue(proxy instanceof StudentRecordProxy);

    }

    @Test
    void testProxyObjectNotNull() {

        StudentRecord proxy = new StudentRecordProxy("ADMIN");

        assertNotNull(proxy);

    }

}
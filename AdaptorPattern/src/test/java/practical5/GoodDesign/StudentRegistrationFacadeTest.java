package practical5.GoodDesign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFacadeTest {

    @Test
    void testRegistrationStartsSuccessfully() {

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        assertDoesNotThrow(() ->
                facade.registerStudent("Ram"));

    }

    @Test
    void testValidationServiceExecuted() {

        ValidationService service = new ValidationService();

        assertDoesNotThrow(() ->
                service.validateStudent("Ram"));

    }

    @Test
    void testDepartmentAllocationExecuted() {

        DepartmentService service = new DepartmentService();

        assertDoesNotThrow(() ->
                service.assignDepartment());

    }

    @Test
    void testNotificationServiceExecuted() {

        NotificationService service = new NotificationService();

        assertDoesNotThrow(() ->
                service.sendNotification("Ram"));

    }

    @Test
    void testFacadeObjectNotNull() {

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        assertNotNull(facade);

    }

}
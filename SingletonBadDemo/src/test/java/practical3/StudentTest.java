package practical3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentTest {

    Student student = new Student.StudentBuilder()
            .studentId(101)
            .name("Ram")
            .email("ram@gmail.com")
            .phoneNumber("9800000000")
            .department("BCA")
            .semester(5)
            .address("Kathmandu")
            .guardianName("Hari")
            .build();

    @Test
    void testStudentCreated() {
        assertNotNull(student);
    }

    @Test
    void testStudentId() {
        assertEquals(101, student.getStudentId());
    }

    @Test
    void testStudentName() {
        assertEquals("Ram", student.getName());
    }

    @Test
    void testDepartment() {
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    void testSemester() {
        assertEquals(5, student.getSemester());
    }

    @Test
    void testEmail() {
        assertEquals("ram@gmail.com", student.getEmail());
    }

    @Test
    void testPhoneNumber() {
        assertEquals("9800000000", student.getPhoneNumber());
    }

    @Test
    void testAddress() {
        assertEquals("Kathmandu", student.getAddress());
    }

    @Test
    void testGuardianName() {
        assertEquals("Hari", student.getGuardianName());
    }
}
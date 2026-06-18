package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository
        implements StudentRepository {

    private List<Student> students = new ArrayList<>();

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void update(Student student) {

        Student existing = findById(student.getId());

        if (existing != null) {
            existing.setName(student.getName());
            existing.setAddress(student.getAddress());
        }
    }

    @Override
    public void delete(int id) {

        Student student = findById(id);

        if (student != null) {
            students.remove(student);
        }
    }
}
package StudentManagement;

import java.util.List;

public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {
        repository.save(student);
    }

    public Student searchStudent(int id) {
        return repository.findById(id);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public void updateStudent(Student student) {
        repository.update(student);
    }

    public void deleteStudent(int id) {
        repository.delete(id);
    }
}
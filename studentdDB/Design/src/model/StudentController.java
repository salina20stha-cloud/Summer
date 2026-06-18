package model;

import java.util.List;

public class StudentController {

    private StudentDAO dao = new StudentDAOImpl();

    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    public Student searchStudent(int id) {
        return dao.getStudentById(id);
    }

    public boolean updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    public boolean deleteStudent(int id) {
        return dao.deleteStudent(id);
    }
}
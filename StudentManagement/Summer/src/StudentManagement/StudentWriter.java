package StudentManagement;

public interface StudentWriter {

    void save(Student student);

    void update(Student student);

    void delete(int id);
}
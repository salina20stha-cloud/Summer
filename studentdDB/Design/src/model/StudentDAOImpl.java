package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void addStudent(Student student) {

        String sql =
                "INSERT INTO students VALUES(?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getCourse());
            ps.setDouble(5, student.getMarks());

            ps.executeUpdate();

            System.out.println("Student Added Successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Student s = new Student();

                s.setStudentId(rs.getInt("student_id"));
                s.setStudentName(rs.getString("student_name"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));
                s.setMarks(rs.getDouble("marks"));

                list.add(s);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    @Override
    public Student getStudentById(int id) {

        String sql =
                "SELECT * FROM students WHERE student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Student(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("email"),
                        rs.getString("course"),
                        rs.getDouble("marks"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public boolean updateStudent(Student student) {

        String sql =
                "UPDATE students SET student_name=?, email=?, course=?, marks=? WHERE student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            ps.setDouble(4, student.getMarks());
            ps.setInt(5, student.getStudentId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean deleteStudent(int id) {

        String sql =
                "DELETE FROM students WHERE student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
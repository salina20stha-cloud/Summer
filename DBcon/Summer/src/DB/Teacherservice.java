package DB;

import DB.DbConnection;
import DB.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Teacherservice {

    public void createTable() throws Exception {

        String sql = """
                CREATE TABLE teacher(
                    id INT PRIMARY KEY,
                    name VARCHAR(100),
                    subject VARCHAR(100),
                    salary DOUBLE PRECISION
                )
                """;

        Connection connection = DbConnection.getConnection();
        Statement statement = connection.createStatement();

        statement.execute(sql);

        System.out.println("Teacher table created successfully");
    }

    public void insert(Teacher teacher) throws Exception {

        String sql = "INSERT INTO teacher VALUES(?,?,?,?)";

        Connection connection = DbConnection.getConnection();

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, teacher.getId());
        ps.setString(2, teacher.getName());
        ps.setString(3, teacher.getSubject());
        ps.setDouble(4, teacher.getSalary());

        int i = ps.executeUpdate();

        System.out.println("Inserted " + i + " row(s)");
    }

    public Teacher getTeacher(int id) throws Exception {

        String sql = "SELECT * FROM teacher WHERE id=?";

        Connection connection = DbConnection.getConnection();

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Teacher teacher = new Teacher();

            teacher.setId(rs.getInt("id"));
            teacher.setName(rs.getString("name"));
            teacher.setSubject(rs.getString("subject"));
            teacher.setSalary(rs.getDouble("salary"));

            return teacher;
        }

        return null;
    }

    public void updateTeacher(Teacher teacher) throws Exception {

        String sql =
                "UPDATE teacher SET name=?, subject=?, salary=? WHERE id=?";

        Connection connection = DbConnection.getConnection();

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, teacher.getName());
        ps.setString(2, teacher.getSubject());
        ps.setDouble(3, teacher.getSalary());
        ps.setInt(4, teacher.getId());

        int i = ps.executeUpdate();

        System.out.println("Updated " + i + " row(s)");
    }

    public void deleteTeacher(int id) throws Exception {

        String sql = "DELETE FROM teacher WHERE id=?";

        Connection connection = DbConnection.getConnection();

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, id);

        int i = ps.executeUpdate();

        System.out.println("Deleted " + i + " row(s)");
    }
}
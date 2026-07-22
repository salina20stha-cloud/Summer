package practical6.GoodDesign;

public class RealStudentRecord implements StudentRecord {

    @Override
    public void viewMarks() {

        System.out.println("\n===== Student Marks =====");
        System.out.println("Java : 90");
        System.out.println("DBMS : 88");
        System.out.println("OOP  : 95");

    }

}
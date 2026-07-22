package practical6.GoodDesign;

public class StudentRecordProxy implements StudentRecord {

    private String role;
    private RealStudentRecord realStudentRecord;

    public StudentRecordProxy(String role) {

        this.role = role;
        this.realStudentRecord = new RealStudentRecord();

    }

    @Override
    public void viewMarks() {

        if (role.equalsIgnoreCase("ADMIN")) {

            realStudentRecord.viewMarks();

        } else {

            System.out.println("\nAccess Denied!");
            System.out.println("Only ADMIN can view student marks.");

        }

    }

}
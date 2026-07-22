package practical5.BadDesign;

public class FacadeBadDemo {

    public static void main(String[] args) {

        ValidationService validation = new ValidationService();
        RollNumberService roll = new RollNumberService();
        SaveStudentService save = new SaveStudentService();
        DepartmentService department = new DepartmentService();
        NotificationService notification = new NotificationService();

        validation.validateStudent();
        roll.generateRollNumber();
        save.saveStudent();
        department.assignDepartment();
        notification.sendNotification();

    }
}
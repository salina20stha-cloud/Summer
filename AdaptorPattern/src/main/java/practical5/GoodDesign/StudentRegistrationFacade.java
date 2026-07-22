package practical5.GoodDesign;

public class StudentRegistrationFacade {

    private ValidationService validationService;
    private RollNumberService rollNumberService;
    private SaveStudentService saveStudentService;
    private DepartmentService departmentService;
    private NotificationService notificationService;

    public StudentRegistrationFacade() {

        validationService = new ValidationService();
        rollNumberService = new RollNumberService();
        saveStudentService = new SaveStudentService();
        departmentService = new DepartmentService();
        notificationService = new NotificationService();

    }

    public void registerStudent(String name) {

        System.out.println("\n===== Student Registration =====");

        validationService.validateStudent(name);
        rollNumberService.generateRollNumber();
        saveStudentService.saveStudent(name);
        departmentService.assignDepartment();
        notificationService.sendNotification(name);

    }

}
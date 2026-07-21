package practical4;

import java.util.Scanner;

import practical1.CollegeConfig;
import practical2.Notification;
import practical2.NotificationFactory;
import practical3.Student;

public class StudentAdmissionService {

    public void admitStudent() {

        Scanner sc = new Scanner(System.in);

        // Singleton Pattern
        CollegeConfig config = CollegeConfig.getInstance();

        System.out.println("=================================");
        System.out.println("   " + config.getCollegeName());
        System.out.println(" Student Admission System");
        System.out.println(" Version : " + config.getSystemVersion());
        System.out.println("=================================");

        // User Input
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Guardian Name: ");
        String guardian = sc.nextLine();

        // Builder Pattern
        Student student = new Student.StudentBuilder()
                .studentId(id)
                .name(name)
                .email(email)
                .phoneNumber(phone)
                .department(department)
                .semester(semester)
                .address(address)
                .guardianName(guardian)
                .build();

        System.out.println("\n===== Student Profile =====");
        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Email      : " + student.getEmail());
        System.out.println("Phone      : " + student.getPhoneNumber());
        System.out.println("Department : " + student.getDepartment());
        System.out.println("Semester   : " + student.getSemester());
        System.out.println("Address    : " + student.getAddress());
        System.out.println("Guardian   : " + student.getGuardianName());

        // Factory Method Pattern
        System.out.println("\nSelect Notification Type");
        System.out.println("1. EMAIL");
        System.out.println("2. SMS");
        System.out.println("3. PUSH");
        System.out.print("Choice: ");

        int choice = sc.nextInt();

        String type;

        switch (choice) {
            case 1:
                type = "EMAIL";
                break;
            case 2:
                type = "SMS";
                break;
            case 3:
                type = "PUSH";
                break;
            default:
                type = "EMAIL";
        }

        Notification notification =
                NotificationFactory.createNotification(type);

        notification.send("Welcome " + student.getName()
                + " to " + config.getCollegeName());

        System.out.println("\nStudent admitted successfully!");
    }
}
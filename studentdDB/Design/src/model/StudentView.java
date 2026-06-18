package model;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);
    StudentController controller = new StudentController();

    public void start() {

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private void addStudent() {

        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Marks: ");
        double marks = sc.nextDouble();

        Student student =
                new Student(id, name, email, course, marks);

        controller.addStudent(student);
    }

    private void viewStudents() {

        List<Student> students =
                controller.getAllStudents();

        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void searchStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Student s =
                controller.searchStudent(id);

        if (s != null)
            System.out.println(s);
        else
            System.out.println("Student Not Found");
    }

    private void updateStudent() {

        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name: ");
        String name = sc.nextLine();

        System.out.print("New Email: ");
        String email = sc.nextLine();

        System.out.print("New Course: ");
        String course = sc.nextLine();

        System.out.print("New Marks: ");
        double marks = sc.nextDouble();

        Student student =
                new Student(id, name, email, course, marks);

        if (controller.updateStudent(student))
            System.out.println("Updated Successfully");
        else
            System.out.println("Student Not Found");
    }

    private void deleteStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (controller.deleteStudent(id))
            System.out.println("Deleted Successfully");
        else
            System.out.println("Student Not Found");
    }
}
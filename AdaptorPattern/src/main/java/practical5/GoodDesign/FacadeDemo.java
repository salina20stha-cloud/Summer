package practical5.GoodDesign;

import java.util.Scanner;

public class FacadeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentRegistrationFacade facade = new StudentRegistrationFacade();

        System.out.println("===== PCPS Student Registration System =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        facade.registerStudent(name);

        sc.close();

    }

}
package practical6.GoodDesign;

import java.util.Scanner;

public class ProxyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Record System =====");
        System.out.print("Enter Role (ADMIN/STUDENT): ");

        String role = sc.nextLine();

        StudentRecord record = new StudentRecordProxy(role);

        record.viewMarks();

        sc.close();

    }

}
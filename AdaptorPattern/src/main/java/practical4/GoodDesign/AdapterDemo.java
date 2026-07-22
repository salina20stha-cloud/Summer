package practical4.GoodDesign;

import java.util.Scanner;

public class AdapterDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Notification notification = new EmailAdapter();

        NotificationClient client = new NotificationClient(notification);

        System.out.println("===== Student Notification System =====");

        System.out.print("Enter Notification Message: ");

        String message = sc.nextLine();

        client.sendNotification(message);

        sc.close();

    }

}
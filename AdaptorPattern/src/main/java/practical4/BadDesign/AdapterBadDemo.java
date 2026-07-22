package practical4.BadDesign;

public class AdapterBadDemo {

    public static void main(String[] args) {

        NotificationSystemBad notification =
                new NotificationSystemBad();

        notification.sendNotification("Exam starts tomorrow");

    }

}
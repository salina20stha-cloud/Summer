package practical4.GoodDesign;

public class NotificationClient {

    private Notification notification;

    public NotificationClient(Notification notification) {

        this.notification = notification;

    }

    public void sendNotification(String message) {

        notification.send(message);

    }

}
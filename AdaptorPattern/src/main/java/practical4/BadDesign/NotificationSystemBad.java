package practical4.BadDesign;

public class NotificationSystemBad {

    public void sendNotification(String message) {

        LegacyEmailService emailService = new LegacyEmailService();

        emailService.sendEmail(message);

    }

}
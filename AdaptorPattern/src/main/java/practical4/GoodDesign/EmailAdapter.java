package practical4.GoodDesign;

public class EmailAdapter implements Notification {

    private LegacyEmailService legacyEmailService;

    public EmailAdapter() {

        legacyEmailService = new LegacyEmailService();

    }

    @Override
    public void send(String message) {

        legacyEmailService.sendEmail(message);

    }

}
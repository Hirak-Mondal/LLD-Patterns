package AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        NotificationService notificationService =  new EmailService();
        notificationService.send("text@abc", "Test Mail", "This is a test mail");

        NotificationService externalService = new ExternalEmailServiceAdapter(new ExternalEmailService());
        externalService.send("text2@abc", "Test external", "Test external notification service");
    }
}

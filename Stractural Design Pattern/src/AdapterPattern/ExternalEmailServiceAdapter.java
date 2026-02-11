package AdapterPattern;

public class ExternalEmailServiceAdapter implements NotificationService{
    private ExternalEmailService externalEmailService;

    public ExternalEmailServiceAdapter(ExternalEmailService externalEmailService){
        this.externalEmailService = externalEmailService;
    }

    @Override
    public void send(String to, String subject, String body) {
        //Adapter method -> converting it to Notification service type
        externalEmailService.sendEmail(to, subject, body);
    }
}

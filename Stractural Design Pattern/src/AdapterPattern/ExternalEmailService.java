package AdapterPattern;

public class ExternalEmailService {
    public void sendEmail(String receiver, String title, String content){
        System.out.println("Using external email service to send mail to " + receiver);
        System.out.println("With title : "+  title);
        System.out.println("And the content is : " + content);
    }
}

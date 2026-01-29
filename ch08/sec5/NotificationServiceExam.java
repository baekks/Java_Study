package sec5;

public class NotificationServiceExam {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification n1 = new EmailNotification("bks93@gmail.com");
        Notification n2 = new SmsNotification("010-4741-6805");
        service.process(n1, "Hello~");
        service.process(n2, "bye~");
    }
}

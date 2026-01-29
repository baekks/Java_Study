package sec5;

public class NotificationService {
    public void process(Notification notification, String message) {
        notification.send(message);
    }
}

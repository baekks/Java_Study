package sec5;

public class SmsNotification extends Notification{
    public SmsNotification(String sms) {
        super(sms);
    }

    @Override
    public void send(String message) {
        System.out.println("[sms 내용]" + message);
    }
}

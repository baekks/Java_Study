package sec5;

public class EmailNotification extends Notification {
    // 생성자 추가
    public EmailNotification(String email) {
        super(email);
    }

    @Override
    public void send(String message) {
        System.out.println("[이메일 내용]" + message);
    }
}

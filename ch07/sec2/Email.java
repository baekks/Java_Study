package sec2;

public class Email {
    private String sender;
    private String receiver;
    private String subject;
    private String content;

    public Email(String sender, String receiver, String subject, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // 깊은 복제(복사) 생성자
    public Email(Email other) {
        this.sender = other.sender;
        this.receiver = other.receiver;
        this.subject = other.subject;
        this.content = other.content;
    }

    public String info() {
        return "Email {" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

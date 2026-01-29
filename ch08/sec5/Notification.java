package sec5;

// 추상 클래스: 멤버 중에 어느 하나라도 추상(abstract)화가 된다면,
// 반드시 class 앞에 abstract 지시자를 넣어줘야 한다. => 부분 추상화
// 추상화(abstract):
public abstract class Notification {
    protected String target;

    public Notification(String target) {
        this.target = target;
    }

    // 공통 추상 메서드
    public abstract void send(String message);
}

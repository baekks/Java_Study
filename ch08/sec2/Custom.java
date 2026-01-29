package sec2;

// sec1.User
// 추가 필드: money;
// 생성자: (userId, userName, money)
// 게터 메서드: getMoney()
// 출력 메서드: String info()
public class Custom extends sec1.User {
    private int money;

    public Custom(String userId, String userName, int money) {
        super(userId, userName);
        this.role = "고~호갱님";
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String info() {
        return "고~호갱님{" +
                "금액: " + money +
                ", 아이디: '" + userId + '\'' +
                ", 이름: '" + userName + '\'' +
                ", 역할: '" + role + '\'' +
                ", 가입일시: " + createAt +
                '}';
    }
}

package sec1;

public class Member extends User {
    private int point;

    public Member(String userId, String userName,int point) {
        // this.userId = userId;
        // this.userName = userName;
        super(userId,userName);     // 부모 생성자 호출
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public String info() {
        return "Member{" +
                "포인트: " + point +
                ", 아이디: '" + userId + '\'' +
                ", 이름: '" + userName + '\'' +
                ", 역할: '" + role + '\'' +
                ", 가입일: " + createAt +
                '}';
    }
}

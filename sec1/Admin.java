package sec1;

// 하위 클래스(Sub Class = 자식 클래스)
// class 클래스명 extends 슈퍼클래스명 { }
// super(매개변수1, ...): 부모 생성자로 부모에 있는 매개변수에 맞추어 사용
// 상속(Inheritance): 클래스의 재사용성을 높이기 위하여 활용
public class Admin extends User {
    private String part;        // 부서

    public Admin (String userId, String userName, String part) {
        super(userId, userName);
        this.role = "ADMIN";    //
        this.part = part;
    }

    public String getPart() {
        return part;
    }

    public String info() {
        return "Admin{" +
                "부서: '" + part + '\'' +
                ", 아이디: '" + userId + '\'' +
                ", 이름: '" + userName + '\'' +
                ", 역할: '" + role + '\'' +
                ", 가입일시: " + createAt +
                '}';
    }
}

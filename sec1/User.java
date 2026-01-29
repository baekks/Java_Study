package sec1;

import java.time.LocalDateTime;
// 상속 시의 효율성을 위하여 상위 클래스는 가급적 공통적인 내용을 기술한다.
// 부모 클래스(Super Class)
// protected: 상속 관계 또는 같은 패키지 내에서 접근 가능
public class User {
    protected String userId;            // 유저 아이디
    protected String userName;          // 유저 이름
    protected String role;              // 권한
    protected LocalDateTime createAt;   // 가입일

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.role = "USER";
        this.createAt = LocalDateTime.now();
    }

    public String info() {
        return "User{" +
                "아이디: '" + userId + '\'' +
                ", 이름: '" + userName + '\'' +
                ", 역할: '" + role + '\'' +
                ", 가입일시: " + createAt +
                '}';
    }
}

package sec2;

public class User {
    protected String id;
    protected String name;

    public User(String id, String name) {
        System.out.println("User 부모 생성자 호출");
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("User{" +
                "아이디: '" + id + '\'' +
                ", 이름: '" + name + '\'' +
                '}');
    }

    public String info() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

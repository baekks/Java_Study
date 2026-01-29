package sec3;

public class User {
    // 아이디, 이름
    protected String id;
    protected String name;

    // 오버로딩(Overloading): 하나의 클래스에서 생성자 함수나 메서드를 같은 이름으로 매개변수의 개수나 타입에 따라 여러 개 기술하는 것
    
    // 생성자 오버로딩(Constructor Overloading)
    public User() {
        System.out.println("User 기본 생성자 호출");
        this.id = "unknown";
        this.name = "익명";
    }
    public User(String id, String name) {
        System.out.println("User 매개변수 생성자 호출");
        this.id = id;
        this.name = name;
    }
    
    // 메서드 오버로딩(Method Overloading)
    public void print() {
        System.out.println("ID: "+id+", Name: "+name);
    }

    public void print(String prefix) {
        System.out.println(prefix+"-"+"ID: "+id+", Name: "+name);
    }
}

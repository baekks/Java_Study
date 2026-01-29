package sec3;

public class Member extends User {
    private int point;

    // 생성자의 오버라이딩: 생성자 오버라이딩은 각각의 클래스로 부터 얻어지는 객체가 서로 다르므로 불가능함
    // @Override
    // public User() { }
    // 생성자 오버로딩
    public Member() {
        super();                // 부모의 생성자 호출 "User 기본 생성자 호출"
        System.out.println("Member 기본 생성자 호출");
        this.point = 0;
    }
    public Member(String id, String name) {
        super(id, name);        // "User 매개변수 생성자 호출"
        System.out.println("Member 매개변수 2개 생성자 호출");
        this.point = 0;
    }
    public Member(String id, String name, int point) {
        super(id, name);
        System.out.println("Member 매개변수 3개 생성자 호출");
        this.point = point;
    }
    // 메서드 오버라이딩
    @Override
    public void print() {
        System.out.println("=====일반 회원=====");
        super.print();
        System.out.println("포인트: "+point);
    }

    // 메서드 오버로딩
    public void print(String data, String msg) {
        System.out.println("오버로딩된 메서드: "+data+", 메세지: "+ msg+", 포인트: "+ point);
    }
}

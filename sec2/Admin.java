package sec2;

public class Admin extends User{
    private String part;

    public Admin(String id, String name, String part) {
        super(id, name);
        System.out.println("자식 Admin 생성자 호출");
        this.part = part;
    }

    @Override
    public void printInfo() {
        System.out.println("관리자: ");
        super.printInfo();
        System.out.println("부서: "+this.part);
    }
}

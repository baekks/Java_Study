package sec2;

public class Member extends User {
    private int point;

    public Member(String id, String name, int point) {
        super(id, name);
        System.out.println("자식 Member 생성자 호출");
        this.point = point;
    }

    // 오버라이드(Override): 슈퍼 클래스로 부터 상속 받은 메서드의 내용을 수정하여 구현
    // 명시적 오버라이드
    @Override
    public void printInfo() {
        System.out.println("일반 회원: ");
        super.printInfo();
        System.out.println("포인트: "+this.point);
    }
}

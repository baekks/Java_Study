package sec3;

public class OverExam {
    public static void main(String[] args) {
        System.out.println("==== 생성자 오버로딩 ====");
        User u1 = new User();
        User u2 = new User("user01", "김기태");

        System.out.println("==== 메서드 오버로딩 ====");
        u2.print();
        u2.print("매개변수 있는 메서드 호출");

        System.out.println("자식 클래스의 객체 생성");
        Member m1 = new Member();
        Member m2 = new Member("user02","고문식");
        Member m3 = new Member("user03", "백경서", 1004);

        System.out.println("자식의 메서드 오버라이딩");
        m1.print();
        System.out.println("자식의 메서드 오버로딩");
        m2.print("이미지 데이터", "주어진 데이터를 훈련시켜줘");

        System.out.println("묵시적 형 변환");
        User u3 = m1;       // 묵시적 형 변환은 하여도 메서드의 성질은 변하지 않음

        System.out.println("가상 메서드 호풀");
        u3.print();         // User에 있는 메서드가 아닌 Member에 있는 메서드를 호출
        // User에 없는 메서드를 호출 => 가상 메서드
    }
}

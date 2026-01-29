package sec2;

// 오버라이딩과 형변환
public class InheritanceCastingExam {

    void userPrint(User user) {
        System.out.println(user.info());
    }
    void memberPrint(Member member) {
        System.out.println(member.info());
    }
    void adminPrint(Admin admin) {
        System.out.println(admin.info());
    }

    public static void main(String[] args) {
        Member m1 = new Member("user01","최정민", 10000);
        // 부모클래스 인스턴스명 = new 자식생성자();
        User m2 = new Member("user02","박지영", 20000);

        Admin a1 = new Admin("admin01","유환희","`IT개발1팀");
        // 부모클래스 인스턴스명 = new 자식생성자();
        User a2 = new Admin("admin02","안민수","`IT운영1팀");

        // 자식클래스 인스턴스명 = new 부모생성자() 는 안된다.
        // Member m3 = new User("user03", "유환희");

        User m3 = new User("user03", "유환희");

        System.out.println("m1.printInfo()");
        m1.printInfo();
        System.out.println("m1.info()");

        // 가상 메서드 활용
        InheritanceCastingExam ins1 = new InheritanceCastingExam();
        ins1.memberPrint(m1);

        ins1.userPrint(m1);
        ins1.adminPrint(a1);
        ins1.memberPrint(m1);


        System.out.println("a1.printInfo()");
        a1.printInfo();
        System.out.println("a1.info()");
        ins1.adminPrint(a1);

        // 묵시적 형 변환이란? 부모클래스 인스턴스명 = new 자식생성자()
        User u1 = m1;   // m1은 Membar m1 = new Member()
        User u2 = m2;   // m2는 User m2 = new Member()
        User u3 = a1;   // a1은 Admin a1 = new Admin()
        User u4 = a2;   // a2는 User a2 = new Admin()
        User u5 = m3;   // m3는 User u3 = new User()
        
        // 강제(명시적) 형 변환 => 허용되지 않을 수 있다.
        // 자식클래스 인스턴스명 = (자식클래스) 부모인스턴스명;
        Member u6 = (Member) m3;
        u6.printInfo();
        u6.info();

        User k1 = m2;
        User k2 = a2;

        User k3 = m1;
        User k4 = a1;

        // 형제 끼리 형 변환 불가
        // Member k5 = a1; // Admin a1 = new Admin()
        // Admin k6 = m1;
    }
}

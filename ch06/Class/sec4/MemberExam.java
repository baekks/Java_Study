package sec4;

public class MemberExam {
    public static void main(String[] args) {
        Member m1 = new Member("bsy", "백시연", 32);
        Member m2 = new Member("cjm", "최정민", 21);

        m1.toString1();
        m2.toString1();

        System.out.println("전체 회원수: " + Member.getMemberCount());
    }
}

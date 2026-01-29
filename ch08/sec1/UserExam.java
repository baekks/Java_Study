package sec1;

public class UserExam {
    public static void main(String[] args) {
        Member mb1 = new Member("user01", "박재융", 1000);
        Member mb2 = new Member("user02", "김진수", 2000);
        
        Admin admin1 = new Admin("sales01", "김민진", "사업1팀");
        Admin admin2 = new Admin("buy01", "전보경", "구매1팀");

        System.out.println("user");
        System.out.println(mb1.info());
        System.out.println(mb2.info());
        System.out.println("admin");
        System.out.println(admin1.info());
        System.out.println(admin2.info());
    }
}

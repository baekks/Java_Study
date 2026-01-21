package question;

public class Q9 { //StudentTest
    public static void main(String[] args) {
        StudentCard card1 = new StudentCard("소프트웨어", "김민진");
        StudentCard card2 = new StudentCard("교통", "최동윤");
        StudentCard card3 = new StudentCard("인공지능", "박주환");

        card1.info();
        card2.info();
        card3.info();
    }
}
class StudentCard {
    private static int no = 0;
    private int stNo;
    private String part;
    private String name;

    public StudentCard(String part, String name) {
        no++;
        this.stNo = no + 100;
        this.part = part;
        this.name = name;
    }

    public static int getNo() {
        return no;
    }

    public int getStNo() {
        return stNo;
    }

    public String getPart() {
        return part;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(name+"님의 학번은 "+stNo+"이며, "+part+"학과에 재학 중입니다.");
    }
}

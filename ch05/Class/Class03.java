package sec1;

public class Class03 {
    public static void main(String[] args) {
        Board b1 = new Board();
        b1.setNo(0);
        b1.setTitle("제목0");
        b1.setContent("내용0");
        b1.setAuthor("관리자");
        b1.setResdate("2026-01-15 11:49:27");
        b1.setHit(0);

        Board b2 = new Board(1);
        b2.setTitle("제목1");
        b2.setContent("내용1");
        b2.setAuthor("김정민");
        b2.setResdate("2026-01-15 11:50:37");
        b2.setHit(0);

        Board b3 = new Board(2, "제목2");
        b3.setContent("내용2");
        b3.setAuthor("박정민");
        b3.setResdate("2026-01-15 11:51:49");
        b3.setHit(0);
        
        Board b4 = new Board(2, "제목3", "내용3");
        b4.setAuthor("이정민");
        b4.setResdate("2026-01-15 11:52:05");
        b4.setHit(0);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}

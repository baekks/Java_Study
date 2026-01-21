package sec1;

public class BoardExam {
    public static void main(String[] args) {
        Board b0 = new Board();
        System.out.println(b0);

        Board b1 = new Board(1L);
        System.out.println(b1);

        Board b2 = new Board(2L, "강사님메롱");
        System.out.println(b2);

        Board b3 = new Board(3L, "나느 봇이 아니다", "정정하라아");
        System.out.println(b3);
    }
}

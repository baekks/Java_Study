package sec1;

public class Class01 {
    public static void main(String[] args) {
        // 객체 선언
        Score s1;
        // 객체 생성
        s1 = new Score();
        s1.kor = 90;
        s1.eng = 80;
        s1.mat = 100;
        s1.tot();

        // 객체 선언과 생성
        Score s2 = new Score();
        s2.kor = 100;
        s2.eng = 80;
        s2.mat = 90;
        s2.tot();
    }
}

package sec1;

public class Condition01 {
    public static void main(String[] args) {
        int score = 90;
        String pass = "불합격";

        // 점수(Score)가 70점 이상이면, "합격", 아니면 "불합격"
        if (score >= 70) pass = "합격";       // 단순 if문
        System.out.println(pass);

        // 삼항 연산자
        String pass1 = (score >= 70) ? "합격" : "불합격";
        System.out.println(pass1);

        if (score >= 70) {                      // 실행 할 문장이 여러 줄일 경우
            pass = "합격";
        }
        System.out.println("판정 : " + pass);
    }
}

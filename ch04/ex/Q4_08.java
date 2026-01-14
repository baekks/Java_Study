package homework;

/*
    96쪽에서 실습한 'if-else if-else문으로 입장료 계산하기' 예제를 바탕으로 성적에 따라 학점을 부여하는 프로그램을 만들어 보세요.
    100~90점은 A, 89~80점은 B, 79~70점은 C, 69~60점은 D, 나머지는 F입니다.
    int형 변수 score와 char형 변수 grade를 사용하여 score에 따른 grade를 출력해 보세요.
 */
public class Q4_08 {
    public static void main(String[] args) {
        int score  = 57;
        char grade;

        if (score >= 90) {
            grade = 'A';
            System.out.println(grade+"학점입니다.");
        } else if (score >= 80) {
            grade = 'B';
            System.out.println(grade+"학점입니다.");
        } else if (score >= 70) {
            grade = 'C';
            System.out.println(grade+"학점입니다.");
        } else if (score >= 60) {
            grade = 'D';
            System.out.println(grade+"학점입니다.");
        }
        else {
            grade = 'F';
            System.out.println("나머지는" + grade + "입니다.");
        }
    }
}

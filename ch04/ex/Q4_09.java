package homework;

/*
    다음 조건식을 조건 연산자 형태로 바꾸어 보세요.
    if (score >= 90) {
        grade = 'A';
    } else {                        => grade = (        ) ? 'A' :        ;
        grade = 'B';
    }
 */
public class Q4_09 {
    public static void main(String[] args) {
        int score = 99;
        char grade;

        grade = (score >= 90) ? 'A' : 'B';
        System.out.println("학점은" + grade);
    }
}

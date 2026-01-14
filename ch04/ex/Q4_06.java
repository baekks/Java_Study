package homework;

/*
    gender 변숫값이 'F'인 경우 '여성입니다.'라고 출력하고, 그렇지 않은 경우 '남성입니다.'를 출력하도록 코드를 완성해 보세요.
 */
public class Q4_06 {
    public static void main(String[] args) {
        char gender = 'F';
        if (gender == 'F') {
            System.out.println("여성입니다.");
        } else {
            System.out.println("남성입니다.");
        }
    }
}

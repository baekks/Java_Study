package homework;

/*
    115쪽에서 실습한 '중첩된 반복문으로 구구단 계산하기' 예제를 수정해 구구단을 3단부터 7단까지만 출력해 보세요.

    int dan;
    int times;

    for (dan=2; dan<=9; dan++) {
        for (times=1; times<=9; times++) {
            System.out.println(dan + "X" + times + "=" + dan * times);
        }
        System.out.println();
    }
 */
public class Q4_14 {
    public static void main(String[] args) {
        int dan;
        int times;


        for (dan=3; dan<=7; dan++) {
            for (times=1; times<=9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}

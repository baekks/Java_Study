package sec1;

/*
    변수 두 개를 선언해서 10과 2.0을 대입하고, 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.
 */
public class Q2_4 {
    public static void main(String[] args) {
        int su1 = 10;
        float su2 = 2.0f;

        // su1 + su2 = 102.0f 앞에 문자열이 있으면 문자열 더하기가 된다. 정상적인 계산을 할 려면 괄호를 해줘야한다.
        System.out.println("su1 + su2 = " + su1 + su2);
        System.out.println("su1 + su2 = " + (su1 + su2));
        System.out.println("su1 + su2 = " + ((int)su1 + su2));
        System.out.println();
        System.out.println("su1 + su2 = " + ((int)(su1 + su2)));
        System.out.println();
        System.out.println("su1 + su2 = " + ((int)(su1 - su2)));
        System.out.println("su1 + su2 = " + ((int)(su1 * su2)));
        System.out.println("su1 + su2 = " + ((int)(su1 / su2)));
    }
}

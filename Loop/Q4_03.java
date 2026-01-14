package homework;

/*
    구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.

    break문을 사용하여
 */
public class Q4_03 {
    public static void main(String[] args) {
        int result = 0;

        for (int i=2; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                if (j>i) break;
                result = i*j;
                System.out.print(i + " * " + j + " = " + result +" \t");
            }
            System.out.println();
        }
    }
}

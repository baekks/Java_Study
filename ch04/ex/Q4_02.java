package homework;

/*
    구구단에서 짝수 단만 출력하도록 프로그램을 만들어 보세요.
    continue문을 사용합니다.
 */
public class Q4_02 {
    public static void main(String[] args) {
        int i,j,result;

        System.out.println();
        for (i=2; i<=9; i++) {
            for (j=1; j<=9; j++) {
                if (i%2 == 0) {
                    result = i*j;
                    System.out.println(i + " * " + j + " = " + result);
                } else if (i%2 ==1) {
                    continue;
                }
            }
        }
    }
}

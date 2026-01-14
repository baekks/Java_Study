package homework;

import java.util.Scanner;

/*
    사용자로부터 정수 n을 입력받아 n의 팩토리얼을 계산하는 프로그램을 작성해 보세요.
    이때 팩토리얼은 1부터 n까지의 모든 정수를 곱한 값입니다.

    출력 결과
    팩토리얼 계산할 숫자를 입력하세요: 10
    10 팩토리얼은 3628800입니다.
 */
public class Q4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼을 계산할 숫자를 입력하세요: ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i=1;i<=n;i++) {
            fact*=i;

        }
        System.out.println(n+"! => "+fact);
    }
}

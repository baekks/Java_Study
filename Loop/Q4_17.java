package homework;

import java.util.Scanner;

/*
    다음 자바 코드를 활용해 사용자로부터 정수 n을 입력받아, 1부터 n까지 수 중 소수를 찾아 출력하는 프로그램을 작성해 보세요.
    이때 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.

    Scanner scanner = new Scanner(System.in);               출력 결과
    System.out.print("숫자를 입력하세요 : ");           =>     숫자를 입력하세요: 10
    int n = scanner.nextInt();                              1부터 10사이의 소수는
                                                            2 3 5 7 입니다.
 */
public class Q4_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i=2; i<=n; i++) {
            boolean isPrime = true;

            for (int j=2; j<i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n소수 갯수 : " + count) ;
    }
}

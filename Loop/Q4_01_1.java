package homework;

import java.util.Scanner;

/*
    operator 값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용해 작성해 보시오.
 */
public class Q4_01_1 {
    public static void main(String[] args) {
        int su1 = 10;
        int su2 = 2;
        char op = '+';
        int result = 0;

        if (op == '+') {
            result = su1 + su2;
        } else if ( op == '-') {
            result = su1 - su2;
        } else if (op == '*') {
            result = su1 * su2;
        } else if (op == '/') {
            result = su1 / su2;
        } else {
            System.out.println("연산자 오류임!!");
        }

        System.out.println("수1을 입력하세요 : " +su1);
        System.out.println("수2를 입력하세요 : " +su2);
        System.out.println("결과 : "+ result);
    }
}

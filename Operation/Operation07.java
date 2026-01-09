package sec1;

/*
    부호 연산자와 연산자의 우선 순위
 */
public class Operation07 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println("처음 a = " + a);      // 20
        a = -a;         // 부호 연산자
        System.out.println("두 번째 a = " + a);    // -20
        a = -a;
        System.out.println("세 번째 a = " + a);    // 20

        // 괄호 문자, 단항 연산, 산술(*, /, %), 산술(+, -), 시프트, 관계, 비트, 논리, 대입(=)

        int num1 = 10;
        int num2 = 3;
        int num3 = 5;

        boolean result = ++num1 * num2 > num3 + 2 && (num1 % num2 == 1) || (num3 << 1) > 5 && !false;
                        // 괄호, 단항, 산술, 시프트, 관계, 비트, 논리, 대입

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("num3 : " + num3);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("++num1 * num2 > num3 + 2 && (num1 % num2 == 1) || (num3 << 1) > 5 && !false");
        System.out.println("결과 : " + result);
    }
}

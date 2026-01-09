package sec1;

/*
    비트 연산 : 2진수 연산으로 &
 */
public class Operation06 {
    public static void main(String[] args) {
        
        // 부동 소수점 = 실수  부호부, 지수부, 가수부
        // 고정 소수점 = 정수  부호부와 숫자
        int a = 10;     // 1010
        int b = 3;      // 0011
        int c = a & b;  // 0010 =>  2 AND 비트 연산
        int d = a | b;  // 1011 =>  11 OR 비트 연산
        int e = ~a;     // 0101 =>  5 Complement(보수) 연산
        int f = a ^ b;  // XOR(eXclusive OR) 배타적(서로 다른) 논리합

        System.out.println("a & b : " + c);
        System.out.println("a | b : " + d);
        System.out.println("~a : " + e);
        System.out.println("a ^ b : " + f);

        int g = a >> 2;     // 산술 우측 시프트(Shift)
        int h = a << 2;     // 산술 좌측 시프트
        int i = a >>> 2;    // 논리 우측 시프트(빈 자리를 0으로 채움)

        System.out.println("a >> 2 : " + g);
        System.out.println("a << 2 : " + h);
        System.out.println("a >>> 2 : " + i);
    }
}
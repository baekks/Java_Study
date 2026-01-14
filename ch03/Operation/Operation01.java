package sec1;

/*
    연산자
    입력 항의 개수 - 단항, 이항, 삼항
    연산 방식에 따라 - 산술, 논리, 비교, 부호, 비트, 증감, 대입
 */
public class Operation01 {
    public static void main(String[] args) {

        /*
            산술 연산 : +, -, *, /, %
            우선 순위 :  괄호, 곱하기/나누기, 더하기/뺴기, 등호(=)
         */
        int su1 = 18;
        int su2 = 4;

        int plus = su1 + su2;
        int minus = su1 - su2;
        int multi = su1 * su2;
        int div = su1 / su2;
        int mod = su1 % su2;
        System.out.println("su1 + su2 = "+plus);
        System.out.println("su1 - su2 = "+minus);
        System.out.println("su1 * su2 = "+multi);
        System.out.println("su1 / su2 = "+div);
        System.out.println("su1 % su2 = "+mod);
    }
}

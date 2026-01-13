package sec2;

/*
    while (조건식) { 반복 수행 할 문장; }
    조건식이 만족하는 동안 반복 수행 할 문장을 반복하여 실행
 */
public class Loop02 {
    public static void main(String[] args) {
        int i = 0, hap = 0;

        while (i <= 10) {   // 10
            hap += i;       // 0+1=>1....36+9=>45+10=>55
            i++;            // 10 while문은 증감식의 위치가 매우 중요하다!!
        }
        System.out.println("hap의 결과 : " +hap);

        System.out.println("while문은 증감식의 위치가 매우 중요하다!! 위아래 비교!!");

        i = 0;
        hap = 0;

        while (i <= 10) {   // 10
            i++;            // 10 while문은 증감식의 위치가 매우 중요하다!!
            hap += i;       // 0+1=>1....36+9=>45+10=>55
        }
        System.out.println("hap의 결과 : " +hap);

        System.out.println("");

        i = 1;
        hap = 0;

        while (i <= 10) {   // 1->2     2->3    ....    10, 11
            hap += i;       // 0+1=>1   1+2=>3  ....    45+10=>55
            i++;            // 2        3       ....    10, 11
        }
        System.out.println("hap의 결과 : " +hap);

        System.out.println("----------------------------------------------------");
        System.out.println("문제 : 1~100까지의 4의 배수의 합계를 계산하여 출력 while");
        System.out.println("----------------------------------------------------");
        int a = 0, sum = 0;

        while (a <= 100) {
            sum += a;
            a += 4;
        }
        System.out.println("4의 배수의 합계 : " +sum);

        System.out.println("----------------------------------------------------");
        System.out.println("문제 : 1~100까지의 4의 배수의 합계를 계산하여 출력 while + if");
        System.out.println("----------------------------------------------------");
        int b = 0, sum1 = 0;

        while (b <= 100) {
            if(b % 4 == 0) {
                sum1 += b;
            }
            b++;
        }
        System.out.println("4의 배수의 합계 : " +sum1);
    }
}

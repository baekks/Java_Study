package sec2;

public class Loop01 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        n++;
        sum += n;

        System.out.println("수 : " + n);
        System.out.println("합산 결과 : " + sum);

        System.out.println("for문");

        /*
            for (초기값 부여; 조건식; 증감식;) {
                반복 실행할 문장;
            }
            초기값 부터 시작하여 조건식이 만족하는 동안 첨자를 증감시키면서 반복 수행하는 명령
         */
        int hap = 0;
        for (int i=1; i<10; i ++) {
            hap += i;
        }
        System.out.println("합산 결과 : " + hap);
    }
}

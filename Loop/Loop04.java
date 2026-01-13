package sec2;

public class Loop04 {
    public static void main(String[] args) {

        // 무한 루프 (조건이 항상 참(true)인 반복문

        /*
            for(;;) {}   → for문의 대표적인 무한 루프 형태
            조건식이 없기 때문에 항상 참으로 판단되어 무한 반복됨

            for (int i=1; true; i++) {
                System.out.println("루프 : " + i);
            }
         */

        /*
            while 문의 무한 루프 예제

            int i = 0;
            while (i <= 0) {    // i가 감소하므로 조건은 항상 참
                i--;
                System.out.println("루프 : " + i);
            }

            ※ i가 계속 감소하므로 조건(i <= 0)은 절대 거짓이 되지 않음
         */
        System.out.println("for문의 무한루프 break");

        // 조건식을 true로 설정한 무한 루프
        // break를 만나면 반복문 즉시 종료
        for (int i=1;true;i++) {
            System.out.println("루프 : " + i);
            if(i>=10) break;
        }

        System.out.println("while문의 무한루프 break");


        // while(true)를 이용한 무한 루프
        int a = 0;
        while(true) {
            a++;
            System.out.println("루프 : " + a);
            if(a>=10) break;
        }

        System.out.println("for문의 continue");

        int hap = 0;
        for (int i = 0; i <= 100; i++) {

            // i가 4의 배수가 아니면
            // 아래 코드를 실행하지 않고 다음 반복으로 이동
            if (i % 4 != 0) continue;

            // 4의 배수인 경우만 실행됨
            hap += i;
        }
        System.out.println("4의 배수의 합계: " + hap);
    }
}

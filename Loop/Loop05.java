package sec2;

public class Loop05 {
    public static void main(String[] args) {

        /*
            중첩 for문을 이용한 삼각형 형태 출력

            i : 행(row)
            j : 열(column)

            출력 형태 (i : j)

            ■                       1 : 1
            ■ ■                     2 : 1, 2
            ■ ■ ■                   3 : 1, 2, 3
            ■ ■ ■ ■                 4 : 1, 2, 3, 4
            ■ ■ ■ ■ ■               5 : 1, 2, 3, 4, 5
            ■ ■ ■ ■ ■ ■             6 : 1, 2, 3, 4, 5, 6
         */

        /*
            바깥 for문 (i)
            → 줄(행)의 개수를 결정

            안쪽 for문 (j)
            → 한 줄에 출력되는 ■의 개수를 결정

            i가 1일 때 j는 1까지 실행 → ■ 1개 출력
            i가 2일 때 j는 2까지 실행 → ■ 2개 출력
            ...
            i가 6일 때 j는 6까지 실행 → ■ 6개 출력
         */

        /*
            for (int i=1;i<=6;i++) { // 1~6 i=1, 2
                for (int j=1; j<=1;j++) { // j=1
                    System.out.println("i, j : (" + i + ","+ j +")");
                }
            }
        */

        // i번째 줄은 i번 실행 된다.
        for (int i = 1; i <= 6; i++) {          // 행(줄) 반복 : 총 6줄
            for (int j = 1; j <= i; j++) {      // 열 반복 : i값만큼 반복
                System.out.print("■ ");         // 줄바꿈 없이 출력
            }
            System.out.println();               // 한 줄 출력 후 줄바꿈
        }

        /*
            ■ ■ ■ ■ ■ ■
            ■ ■ ■ ■ ■
            ■ ■ ■ ■
            ■ ■ ■
            ■ ■
            ■
         */

        System.out.println("\n문제 1번\n");
        for (int k=1; k<=6; k++){
            for (int l=6; l>k; l--){
                System.out.print("■ ");
            }
            System.out.println();
        }

        /*
            구구단
            2단  3단  4단  ... 9단
         */

        System.out.println("\n문제 2번\n");
    }
}
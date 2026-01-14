package homework;

/*
    반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
                    j<=4-i          k=i*2-1
          *         3번 띄우기      1
        * * *       2번 띄우기      3
      * * * * *     1번 띄우기      5
    * * * * * * *   0번 띄우기      7
    
    한 줄당 공백을 출력하는 부분과 별을 출력하는 부분
 */
public class Q4_04 {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++) {
            // 공백 2칸씩 반복 출력 구간
            for (int j=1; j<=4-i; j++) {
                System.out.print("  ");
            }
            // 별("* ")을 출력하는 구간
            for (int k=1; k<=i*2-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//        for (int i=1; i<=7; i++) {
//            if (i%2 == 0) continue;
//            for (int j=1; j<=i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
    }
}

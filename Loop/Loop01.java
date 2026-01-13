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

        // 루프(Loop) : 반복 실행을 돌려보는 행위로 반복을 의미 : ①  ->  ②  ->  ④  ->  ③ 반복 실행
        //       ①    ②    ③
        for (int i=1; i<=10; i++) {     // i: 첨자 = 카운트 변수
            hap += i;       // ④ hap = hap + i -> 1 -> 3 -> 6 -> 10 -> 15 - > 21 -> 28 -> 36 -> 45
            System.out.println("hap+=i : "+hap);
        }
        /*
            위 for() 문장에서
            ① int i=1 은 최초 1번만 실행
            ② i<10은 조건식으로 해당 조건이 만족하는 동안만 실행
            ④ 실행문 hap+=i이 실행 --> 1
            ③ 증감식 i++를 실행하여 i를 1 증가  --> 2
            ② i<10은 조건식으로 해당 조건이 만족하는 동안만 실행 (2<=10)
            ④ 실행문 hap+=i이 실행 --> 3
            ③ 증감식 i++를 실행하여 i를 1 증가  --> 3
            ② i<10은 조건식으로 해당 조건이 만족하는 동안만 실행 (3<=10)
            ...
            ④ 실행문 hap+=i이 실행 --> 36
            ③ 증감식 i++를 실행하여 i를 1 증가  --> 9
            ② i<10은 조건식으로 해당 조건이 만족하는 동안만 실행 (9<=10)
            ④ 실행문 hap+=i이 실행 --> 45
            ③ 증감식 i++를 실행하여 i를 1 증가  --> 10
            ② i<10은 조건식으로 해당 조건이 만족하는 동안만 실행 (10<=10)
            ④ 실행문 hap+=i이 실행 --> 55
            ③ 증감식 i++를 실행하여 i를 1 증가  --> 11
            ② i<10은 조건식으로 해당 조건이 만족하는 동안만 실행 (11<=10)
            위 조건이 11 <= 10 은 거짓이므로 실행은 종료됨
         */
        System.out.println("합산 결과 : " + hap);   // 55

        // 역 for문
        System.out.println("역 for문");
        hap = 0;
        for (int i=10;i>=1; i--) {
            System.out.print(i + " ");
            hap += i;   // 0+10=10+9=19+8=27+7=34+6=40+5=45+4=49+3=52+2=54+1=55
        }
        System.out.println("\n\"10 ~ 1 의 합산 결과\" : " + hap);


        System.out.println("=================================");
        System.out.println("문제");
        /*
            1 ~ 100 짝수와 짝수의 합계를 출력하는 for문
        */

        hap = 0;

        for (int i=0; i<=100; i+=2) {
            System.out.print(i + " ");
            hap += i;
        }

        /*
            위에랑 똑같음
            for (int i=1; i<=100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    hap += i;
                }
            }
         */
        System.out.println();
        System.out.println("1~100의 짝수의 합계 : " + hap);

        System.out.println("============문제=============");
        // 1~100 의 3의 배수의 합계를 출력
        // 3 6 9
        hap = 0;
        for (int i=0; i<101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                hap += i;
            }
        }
        System.out.println("\n1~100의 3의 배수 합계 : " + hap);

    }
    /*
        \n : 줄 바꿈
        \t : 4칸 띄우기
        \\ : \출력
        \" : "출력
        \' : '출력
     */

}

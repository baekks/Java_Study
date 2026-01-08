package sec1;

    // 상수와 리터럴
public class Variable04 {
    public static void main(String[] args) {

        // int 타입, a 변수 or 변수명, = 연산자, 1004 Literal(리터럴) 값, ; 종결자
        int a = 1004;   // 대입(저장) 연산자 =

        final float PI = 3.14f;         // 상수(Constant)
        final int MAX_POINT = 100;
        final int MIN_POINT = 0;

        final float Star_Max = 5.0f;
        final float Star_Min = 0.0f;

        String name = "백경서";          // 문자열 - 참조 타입(Reference Type), String은 문자열에 쓰인다.

        System.out.println("원주율 : " + PI);
        System.out.println("점수 구간 : " + MIN_POINT + " ~ " + MAX_POINT);
        System.out.println("이름 : " + name);

        System.out.println("별점 구간 : " + Star_Min + " ~ " + Star_Max);
    }
}

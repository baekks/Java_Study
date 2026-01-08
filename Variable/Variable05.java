package sec1;
/*
    묵시적 형 변환 (자동 형 변환)
        작은 타입 -> 큰 타입으로 자동 변환
        데이터 손실 없음
    명시적 형 변환 (강제 형 변환)
        큰 타입 -> 작은 타입으로 변환
        데이터 손실 가능성이 있음
        반드시 형 변환 연산자를 사용해야함
 */
public class Variable05 {
    public static void main(String[] args) {
        byte num = 127;
        int num2 = num;             // 자동 형 변환 => 묵시적 형 변환

        int num3 = 1004;
        byte num4 = (byte)num3;     // 강제 형 변환 =>

        System.out.println("num3 : " + num3);
        System.out.println("num4 : " + num4);

        int su1 = 34;
        byte su2 = (byte) su1;      // ~128 ~ 127 허용 범위 안에 들어와있는 값이라 형 변환이 가능하다.
        System.out.println("su1 : " + su1);
        System.out.println("su2 : " + su2);
    }
}

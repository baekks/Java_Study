package sec1;

// 변수의 타입
public class Variable02 {

    public static void main(String[] args){

        // 변수의 기본 타입 (Primitive Type)
        boolean a = true;       // 1Byte (Boolean)

        /*
            1byte는 8bit이다 음수와 양수를 포함해 256을 저장할 수 있는데, 음수 = -128 ~ -1, 양수 = 0 ~ 127
         */
        byte b = 127;           // 1Byte - (숫자, 문자) (Byte) => 128을 넣으면 오류가 나는데 그것을 오버플로우 라고 한다.
                                //                              -130을 넣으면 오류가 나는데 그것을 언더플로우 라고 한다.

        /*
            char는 한 글자만 저장한다. 한글도 표현을 하기 때문에 2Byte이다. 초기화 할 때 '' 따옴표 안에 넣어야 한다.
            char는 문자 그 자체가 아니라 유니코드 숫자, 그래서 음수가 없다. char는 정수 타입의 일종
         */
        char c = 'a';           // 2Byte - 문자 (Character)
        short d = 15536;        // 2Byte(16bit) 반정도(정수의 반) 정수 (Short)
        int e = 65536;          // 4Byte(32bit) 정수 (Integer)
        long f = 653467L;       // 8Byte(64bit) 배정도(정수의 배) 정수 (Long)
        float g = 3.14f;        // 4Byte(32bit) 실수(Floating Point = 부동소수점수) 314Xe+01 => 부호, 지수, 가수 (Float)
        double h = 6.28;        // 8Byte(64bit) 실수, h = 6.28d => 8Byte(64bit) 배정도 실수 (Double)

        // 참조 타입 (Reference Type) : Wrapper Type (기본형이 확장된 타입) = 객체
        Boolean a1 = a;         // 박싱(Boxing) : 기본 타입을 래퍼 타입 (Wrapper type)으로 변경
        boolean a2 = a1;        // 언박싱(Unboxing) : 래퍼타입 (Wrapper Type)을 기본 타입으로 변경
        Integer e1 = e;
        int e2 = e1;

        System.out.println("Boolean : " + Boolean.FALSE + " ~ " + Boolean.TRUE);
        System.out.println("Byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("Character : " + Character.MIN_VALUE + " ~ " + Character.MAX_VALUE);
        System.out.println("Short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("Integer : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("Long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("Float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("Double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
    }
}

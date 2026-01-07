package sec1;
/*
    1. 변수(Variable)와 상수(Constant)의 선언(Dimension)과 할당(Allocation)
    2. 전역(Global=외부 변수) 변수와 지역(Local=내부 변수) 변수
 */
public class Variable01 {

    boolean a = true;               // 전역 변수
    public static void main(String[] args){
        boolean a;                  // a는 변수 => 변수 선언 => a는 boolean(true/false)를 저장할 것임을 선언
        /* 할당(초기화)을 하지 않으면 메모리에 저장을 하지 않는다. */
        a = false;                  // a 변수에 값을 할당 => a 변수에 false 값을 대입
        System.out.println("a = "+a);
        /* 변수는 선언과 할당이 모두 주어져야지 활용할 수 있음 */
        final boolean b = false;    // b는 상수이며, boolean 상수를 저장할 것임을 선언하고, false 값을 대입(저장)한다.

        boolean c = true;           // 선언과 할당(초기화)을 동시에 진행하는 문장
    }
}

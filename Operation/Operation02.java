package sec1;

/*
    증감 연산자 : ++, --
*/
public class Operation02 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;

        /*
            전위 연산(선행증감) : 연산 먼저 -> 사용(출력)
            후위 연산(후행증감) : 출력(사용) 먼저 -> 연산
         */
        System.out.println(a++);    // 출력을 하고 ++(증가) 시킴. 실제 메모리에는 1이 저장되어있지만 출력은 0이 나온다.
        System.out.println(++b);    // ++(증가)를 시키고 출력함.
        System.out.println(c--);    // 출력을 하고 --(감소) 시킴. 실제 메모리에는 -1이 저장되어있지만 출력은 0이 나온다.
        System.out.println(--d);    // --(감소)를 시키고 출력함.
    }
}

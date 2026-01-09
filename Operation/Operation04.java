package sec1;

/*
    논리 연산자
    And(&&) : 모두가 참일 때 참
    Or(||)  : 하나만 참이여도 참
    Not(!)  : 참은 거짓으로, 거짓은 참으로 바꿈
*/
public class Operation04 {
    public static void main(String[] args) {
        boolean sw1 = false;
        boolean sw2 = true;
        boolean sw3 = true;
        boolean sw4 = false;

        System.out.println(sw1);        // false
        System.out.println();
        System.out.println("Not(=Complement 보수) : true -> false, false -> true");
        System.out.printf("!false : " + !sw1 + " / ");       // !false -> true
        System.out.println("!true : " + !sw2 + " / \n");       // !true -> false
        System.out.println("And(&&) : 입력 항(주어진 조건)이 모두 true인 경우만 출력이 true => 논리곱(·)");
        System.out.printf("false && false : " + (sw1 && sw4) + " / "); // false && false -> false
        System.out.printf("false && true : " + (sw1 && sw2) + " / "); // false && true -> false
        System.out.printf("true && false : " + (sw2 && sw4) + " / "); // true && false -> false
        System.out.println("true && true : " + (sw2 && sw3) + " / \n"); // true && true -> true
        System.out.println("Or(||) : 하나라도 true, 출력은 true => 논리합(+)");
        System.out.printf("false || false : " + (sw1 || sw4) + " / "); // false || false -> false
        System.out.printf("false || true : " + (sw1 || sw2) + " / "); // false || true -> true
        System.out.printf("true || false : " + (sw2 || sw4) + " / "); // true || false -> true
        System.out.println("true || true : " + (sw2 || sw3) + " / "); // true || true -> true
    }
}

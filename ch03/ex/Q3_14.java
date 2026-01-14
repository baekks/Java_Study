package sec1;

public class Q3_14 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("원래 값 : " +n);
        System.out.println("반대로 뒤집은 값 : " + (~n));
        System.out.println("이진수로 표현한 원래 값 : " + Integer.toBinaryString(n));
        System.out.println("이진수로 표현한 반대로 뒤집은 값 : " + Integer.toBinaryString(~n));
    }
}

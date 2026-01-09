package sec1;

/*
    관계 연산 : ==, !=, >, >=, <, <=
              모든 관계 연산이 결과는 논리값이 나온다.
*/
public class Operation05 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        int d = a + b;

        System.out.printf("a = b : " + (a == b) + " / ");   // false
        System.out.println("c = d : " + (c == d));          // true
        System.out.printf("a != b : " + (a != b) + " / ");  // true
        System.out.println("c != d : " + (c != d));         // false
        System.out.printf("a > b : " + (a > b) + " / ");    // false
        System.out.println("c > b : " + (c > b));           // true
        System.out.printf("c >= a : " + (c >= a) + " / ");  // true
        System.out.println("c >= b : " + (c >= d));         // true
        System.out.printf("a < b : " + (a < b) + " / ");    // true
        System.out.println("c < d : " + (c < d));           // false
        System.out.printf("a <= b : " + (a <= b) + " / ");  // true
        System.out.println("c <= d : " + (c <= d));         // true
    }
}

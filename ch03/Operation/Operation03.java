package sec1;

/*
    대입 연산자 : =, +=, -=, *=, /=, %=, (>>=, <<=, &=, |=)
 */
public class Operation03 {
    public static void main(String[] args) {

        int i = 20; // i 변수에 20을 대입하라

        ++i;        // i=i+1 or i+=1
        System.out.println("i = " + i);     // 21

        i += 2;     // i = i + 2
        System.out.println("i = " + i);     // 23

        i -= 4;       // i = i - 4
        System.out.println("i = " + i);     // 19

        i--;
        System.out.println("i = " + i);     // 18

        i  *= 3;       // i = i * 3
        System.out.println("i = " + i);     // 54

        i /= 2;           // i = 1 / 2
        System.out.println("i = " + i);     // 27

        i %= 2;         // i = i % 2
        System.out.println("i = " + i);     // 1
    }
}

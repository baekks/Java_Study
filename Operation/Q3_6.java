package sec1;

public class Q3_6 {
    public static void main(String[] args) {
        int num = 8;

        System.out.println(num += 10);      // 18
        System.out.println(num -= 10);      // 8
        System.out.println(num >>= 2);      // 0000 1000 => 0000 0010 => 2
    }
}

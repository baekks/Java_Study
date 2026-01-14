package homework;

public class hw02 {
    public static void main(String[] args) {

        /*
            구구단
            2단      3단      4단  ...     9단
            2*1=2   3*1=3   4*1=4
         */

        System.out.println("\n문제 2번\n");
        int result = 0;

        for (int i=2; i<=9; i++) {
            System.out.print(i+"단 \t\t");
        }
        System.out.println();
        for (int j=1; j<=9; j++){
            for (int i=2; i<=9; i++) {
                result = i*j;
                System.out.print(i + " * " + j + " = " + result +" \t");
            }
            System.out.println();
        }
    }
}

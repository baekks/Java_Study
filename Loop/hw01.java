package homework;

public class hw01 {
    public static void main(String[] args) {

        /*
            ■ ■ ■ ■ ■ ■
            ■ ■ ■ ■ ■
            ■ ■ ■ ■
            ■ ■ ■
            ■ ■
            ■
         */

        System.out.println("\n문제 1번\n");
        for (int i=1; i<=6; i++){
            for (int j=6; j>i; j--){
                System.out.print("■ ");
            }
            System.out.println();
        }
    }
}

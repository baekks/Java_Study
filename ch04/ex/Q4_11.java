package homework;

/*
    while문을 사용해 1부터 50까지 더하는 프로그램입니다. 코드를 완성해 보세요.

    int num = 1;
    int sum = 0;

            (num <= 50) {
        sum += num;

    }
    System.out.println("1부터 50까지의 합은" + sum + "입니다.");
 */
public class Q4_11 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num<=50){
            sum+=num;
            num++;
        }
        System.out.println("1~50까지 합은" + sum + "입니다.");
    }
}

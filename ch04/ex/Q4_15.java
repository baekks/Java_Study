package homework;

/*
    1부터 100까지 수 중에서 3의 배수만 출력하는 코드를 완성해 보세요.

    int num;

    for (       ;       ;num++) {
        if (        )
            continue;
        System.out.println();
    }
 */
public class Q4_15 {
    public static void main(String[] args) {
        int num;

        for(num=1;num<=100;num++) {
            if (num%3!=0) continue;
            System.out.print(num+"\t");
        }
    }
}

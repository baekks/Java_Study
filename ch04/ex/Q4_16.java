package homework;

/*
    1부터 시작해서 1씩 숫자를 늘려 더했을 때 그 합이 500이 넘는 순간 마지막으로 더한 자연수는 얼마인가요?
    다음 코드의 빈칸을 채우고 프로그램을 직접 실행해 출력 결과도 확인해 보세요.

    int sum = 0;
    int num;
    for(num=1;) {
        sum += num;


    }
    System.out.println(sum);
    System.out.println(num);
 */
public class Q4_16 {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        for(num=1;num<=500;num++) {
            sum += num;
            if (sum > 500) break;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}

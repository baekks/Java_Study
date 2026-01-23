package QnA;

public class Q7_03 {
    // 배열 길이가 5인 정수형 배열을 선언하고, 1~10 중 짝수만을 배열에 저장한 후 그 합을 출력하세요.
    // 2,4,6,8,10
    public static void main(String[] args) {
        int[] arry= new int[5];
        int index = 0;
        int su = 0;

        for (int i=1; i<=10; i++) {
            if(i%2 == 0) {
                arry[index] = i;
                su += i;
                index++;
            }
        }
         for (int i=0; i<arry.length; i++) {
             System.out.println("index["+i+"] = "+ arry[i]);
         }
        System.out.println("arry[i]의 합: " + su);
    }
}

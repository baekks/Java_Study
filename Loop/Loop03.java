package sec2;

/*
    do~ while : do 블록을 먼저 수행하고, 조건비교를 나중에 하므로 반드시
    1회 이상 실행이 보장된다.
 */
public class Loop03 {
    public static void main(String[] args) {
        int i = 101;
        int sum= 0;

        do {
            sum+=i;
            i--;
        } while (i<99);
        System.out.println("do~while문을 쓴 합산 결과 : " +sum);

        i = 100;
        sum = 0;

        while (i<100) { // 1번 조건을 만족 된 적이 없어 처믕부터 실행이 안됨
            sum+=i;
            i--;
        }
        System.out.println("while문을 쓴 합산 결과 : " +sum);
    }
}

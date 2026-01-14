package homework;

/*
    operator 값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용해 작성해 보시오.
 */
public class Q4_01_2 {
    public static void main(String[] args) {
        int su1 = 10;
        int su2 = 2;
        char op = '*';
        int result = 0;

        switch (op) {
            case ('+'):
                result = su1 + su2;
                System.out.println("결과 : "+ result);
                break;
            case ('-'):
                result = su1 - su2;
                System.out.println("결과 : "+ result);
                break;
            case ('*'):
                result = su1 * su2;
                System.out.println("결과 : "+ result);
                break;
            case ('/'):
                result = su1 / su2;
                System.out.println("결과 : "+ result);
                break;
            default:
                System.out.println("연산 불가");
        }
    }
}

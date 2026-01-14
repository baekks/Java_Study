package homework;

/*
    96쪽에서 실습한 'if-else if-else문으로 입장료 계산하기' 예제에서 age가 60살 이상인 경우에 '경로우대입니다.'와 '입장료는 0원입니다.'를 출력하도록 수정해 보세요.
 */
public class Q4_07 {
    public static void main(String[] args) {
        int age = 98;
        int charge;

        if(age < 8){
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        else if(age < 14){
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if(age < 20){
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        }
        else if(age >= 60){
            charge = 0;
            System.out.println("경로우대입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원입니다.");
    }
}

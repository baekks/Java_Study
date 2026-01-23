package sec2;

public class EmailExam {
    public static void main(String[] args) {
        Email[] emails1 = new Email[3];

        emails1[0] = new Email("baek@gmail.com", "kim@gmail.com", "회의 일정", "내일 10시에 회의를 진행합니다.");
        emails1[1] = new Email("kim@gmail.com", "park@gmail.com", "과제 제출", "과제는 다음 주 금요일에 완성하기 바랍니다.");
        emails1[2] = new Email("park@gmail.com", "choi@gmail.com", "점심 일정", "토요일 11시 30분 팀 모임 겸 식사를 추억의 분식에서 있습니다.");

        Email[] emails2 = new Email[3];
        emails2 = emails1;                              // 값을 전달한게 아니라 주소를 전달하여 저장 -> 얕은 복사(복제) (C언어에서는 포인터라고 함...ㅋ)
        System.out.println(emails1);
        System.out.println(emails2);
        emails1[1] = new Email("park@gmail.com", "choi@gmail.com", "과제 제출 마감일 수정", "다다음주 월요일 수업 시작 전까지 완성해서 제출하래요");
        System.out.println(emails1[1].getSubject());
        System.out.println(emails2[1].getSubject());

        // Object(시조) => obj.clone() 암묵적
        Email[] shallowCopy = emails1.clone();          // 얕은 복제2 => 깊은 복제 (생성자 때문에)
        System.out.println("=====얕은 복제2 -> 깊은 복제2=====");
        System.out.println(emails1);
        System.out.println(shallowCopy);
        emails1[1] = new Email("kim@gmail.com", "park@gmail.com", "팀 과제 제출", "팀과제는 다다음주 금요일에 완성하기 바랍니다.");
        System.out.println(emails1[1].getSubject());
        System.out.println(shallowCopy[1].getSubject());

        // 완벽한 깊은 복제
        Email[] deepCopy = new Email[emails1.length];   // 주소 다르게
        for(int i=0; i< emails1.length; i++) {          // 명시적으로 내용도 하나 하나 전달
            deepCopy[i]  = new Email(emails1[i]);
        }
        emails1[1] = new Email("kim@gmail.com", "park@gmail.com", "팀 과제 마감일", "팀 과제 마감은 2월9일 입니다..");
        System.out.println(emails1[1].getSubject());
        System.out.println(shallowCopy[1].getSubject());
    }
}

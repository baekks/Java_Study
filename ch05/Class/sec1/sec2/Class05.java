package sec2;

public class Class05 {
    public static void main(String[] args) {

        // School > ElementarySchool > MiddleSchool
        School sh1;                     // 조상
        ElementarySchool el1;           // 부모
        MiddleSchool md1;               // 자식

        // 객체 형 변환: 조상은 부모나 자식을 모두 낳을 수 있음 => 객체의 다형성
        sh1 = new School();
        sh1 = new ElementarySchool();
        sh1 = new MiddleSchool();

        // el1 = new School();
        el1 = new ElementarySchool();
        el1 = new MiddleSchool();

        // md1 = new School();
        // md1 = new ElementarySchool();
        md1 = new MiddleSchool();
    }
}

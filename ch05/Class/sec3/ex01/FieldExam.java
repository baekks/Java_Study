package sec3.ex01;

public class FieldExam {
    public static void main(String[] args) {
        Field01 f1 = new Field01();
        f1.no = 1;
        f1.name = "백시연";
        f1.pi = 6.28;
        Field01.pi = 6.28;      // static = 객체 생성 필요 없음
        // f1.PERFECT = 200; - 상수는 재선언/값변경이 불가 - final static : 자바 17이하 버전

        f1.setMsg("안녕하세요");

        Exam ex1 = new Exam();
        f1.setEx(ex1);

        Field01 f2 = new Field01();
        f2.no = 27;
        f2.name = "셔니";
        f2.pi = 9.42;
        f2.setMsg("나는 셔니");
        f2.setEx(ex1);

        System.out.println(f1.no+", "+
                f1.name+", "+ f1.pi+ ", "+
                f1.PERFECT+", "+f1.getMsg());

        System.out.println(f2.no+", "+
                f2.name+", "+ f2.pi+ ", "+
                f2.PERFECT+", "+f2.getMsg());
    }
}

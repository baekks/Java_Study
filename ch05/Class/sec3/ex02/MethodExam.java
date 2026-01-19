package sec3.ex02;

public class MethodExam {
    public static void main(String[] args) {
        Method01 m1 = new Method01();
        m1.setKor(80);
        m1.setEng(75);
        m1.setMat(90);

        // 국어, 영어, 수학 각 출력하되 getter 메서드를 활용하여
        System.out.println("국어 : " + m1.getKor());
        System.out.println("영어 : " + m1.getEng());
        System.out.println("수학 : " + m1.getMat());

        // 오버로딩
        m1.print();
        m1.print(95);
        m1.print(94,100);
        m1.print(94,100, 90);
        
        // 매개변수와 반환의 유무에 따라
        System.out.println(m1.print2());
        System.out.println(m1.print2(100));

        // 접근제한자에 따라
        System.out.println("default: " +m1.averageScore());
        System.out.println("protected: " +(m1.isPass() ? "합격" : "불합격"));
        // System.out.println("private: " + m1.totalScore());

        // final 메서드
        System.out.println("등급: " +m1.grade());

        // static 메서드
        Method01.print3();

    }

    class Method02 extends Method01 {
        /*
            Method01에서 final이 걸려있어서 상속은 받을수 있지만 재정의할수 없다.
            @Override
            public final String grade() {
                return "OK";
            }
         */
    }
}

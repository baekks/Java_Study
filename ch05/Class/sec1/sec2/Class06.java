package sec2;

// 다른 패키지에 있는 클래스를 가져와서 쓸 때는 import [패키지명].[클래스명]
import sec1.Score;

public class Class06 {
    public static void main(String[] args) {
        int i = 0;          // 기본 자료형: boolean, byte, char, short, int, float, long, double
        float j = 0.0f;
        // 기본 자료형은 메모리 할당하려면 반드시 초기화가 필요함
        // 참조형은 메모리 할당하려면 반드시 생성을 하고, 각 필드는 자동으로 초기화가 된다.

        Student st1;        // 참조형
        // System.out.println(st1); - 할당(생성) 안됨
        st1 = new Student();
        System.out.println(st1);

        Student st2 = new Student();
        System.out.println(st2);

        Score s1 = new Score();
        s1.kor = 100;
        s1.eng = 80;
        s1.mat = 100;
        s1.tot();
    }
}

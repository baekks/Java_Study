package sec1;

    /*
        변수 명명 규칙
        1. 영문 소문자로 시작하고, 뒤에 숫자를 포함할 수 있음 (단, 특수문자에서 $, _ 로 시작할 수 있음)
        2. 예약어(keyword = Reserved word)는 사용할 수 없다. (단, 카멜케이스나 스네이크 방식을 활용하여 예약어를 변형할 수 있음)
            ex) print_ln, printLn, break1, Break
        3. 영문 대소문자를 구분한다.
        4. 중간에 띄워쓰기 할 수 없음

        관례
        카멜케이스 방식을 활용하여 여러 단어를 연결하여 명명할 수 있다. (youAreStudent)
        누구나 쉽게 해당 데이터가 무엇인지 알 수 있게 해야한다.
    */
public class Variable03 {
    public static void main(String[] args) {

        char myChar = 'A';

        System.out.println("myChar : " + myChar);            // myChar : A

        short myNum = (short)myChar;        // 강제 형 변환 (Casting)
        System.out.println("myNum : " + ((short) myNum));  // myNum : 65 -> 65는 ASCII CODE 값

        int kor = 98;
        int mat = 100;
        int eng = 76;
        int tot = kor + mat + eng;
        float avg = tot / 3.0f;            // 연산에 의하여 해당 데이터가 실수형으로 정확하게 연산되어야 함에도 정수 형대의 결과로 변환되는데 자동 형변환(Auto Casting)이라함
        System.out.println("국어 : " + kor);
        System.out.println("수학 : " + mat);
        System.out.println("영어 : " + eng);
        System.out.println("--------------");
        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
    }
}

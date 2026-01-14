package sec1;

// 클래스 : 틀 - 속성(값 저장), 메서드(처리), 생성자(함수)
public class Score {
    // 멤버 속성 선언
    short kor;
    short eng;
    short mat;

    public Score() { }  // 이게 원래 있어야 사용이 가능하지만 안써도 생략이 되어있다.

    // 멤버 메서드
    void tot() {
        System.out.println("총점: " + (this.kor + this.eng + this.mat));
    }

}

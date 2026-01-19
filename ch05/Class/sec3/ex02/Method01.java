package sec3.ex02;

public class Method01 {
    private int kor;
    private int eng;
    private int mat;

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    //매개변수와 리턴의 유무에 따라
    //매개변수(X), 리턴(X)
    public void print() {
        System.out.println("감사합니다.");
    }
    //매개변수(O), 리턴(X)
    //오버로딩(Overloading): 하나의 클래스에서 같은 이름의 메서드를
    //매개변수에 개수나 타입에 따라 다르게 구현하는 방법
    public void print(int kor) {
        System.out.println("국어 점수: "+kor);
    }
    public void print(int kor, int eng) {
        System.out.println("국어 점수: "+kor);
        System.out.println("영어 점수: "+eng);
    }
    public void print(int kor, int eng, int mat) {
        System.out.println("국어 점수: "+kor);
        System.out.println("영어 점수: "+eng);
        System.out.println("수학 점수: "+mat);
    }
    //매개변수(X), 리턴(O)
    public int print2() {
        return this.kor;
    }

    //매개변수(O), 리턴(O)
    public int print2(int kor) {
        return kor;
    }

    //public > protected > default > private
    private int totalScore() {
        return this.kor+this.eng+this.mat;
    }

    double averageScore() {
        return this.totalScore() / 3.0f;
    }

    protected boolean isPass() {
        return this.totalScore() >= 230;
    }

    public void tot(){
        this.totalScore();
    }

    //정적 메서드: 객체 필요없이 호출
    public static void print3() {
        System.out.println("잘~가!");
    }

    //final 메서드: 오버라이딩 불가(상속 받은 후 내용 수정 안됨)
    public final String grade() {
        double avg = this.averageScore();
        if(avg>=90) {
            return "A";
        } else if(avg>=80) {
            return "B";
        } else if(avg>=70) {
            return "C";
        } else if(avg>=60) {
            return "D";
        } else {
            return "F";
        }
    }


}

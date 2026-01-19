package sec3.ex01;

public class Field01 {
    public int no;
    String name;
    private String msg;
    private Exam ex;
    static double pi = 3.14;        // 공유 변수
    final short PERFECT = 100;      // 상수(관례적으로 상수일 떄만 대문자를 사용함)

    public Exam getEx() {
        return ex;
    }

    public void setEx(Exam ex) {
        this.ex = ex;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class Exam {
    int no;
    String name;
}
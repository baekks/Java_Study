package sec2;

// 재사용성: extends, implements(추상체에서 상속)
// 서브(자식) 클래스
public class Subway extends Vehicle{
    private int lineNo;

    public Subway() {
    }
    public Subway(int lineNo) {
        this.lineNo = lineNo;
    }

    public int getLineNo() {
        return lineNo;
    }
    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public void showInfo() {
        System.out.println(this.lineNo + "호선의 지하철의 승객은 " + super.getCustomCount() + "명이 탑승하였습니다.");
    }
}

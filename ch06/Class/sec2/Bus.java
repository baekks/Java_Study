package sec2;

public class Bus extends Vehicle {
    private int busNo;

    public Bus() {
    }
    public Bus(int busNo) {
        this.busNo = busNo;
    }

    public int getBusNo() {
        return busNo;
    }
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public void showInfo() {
        System.out.println(this.busNo + "번 버스의 승객이 " + super.getCustomCount() + "명 타고 있습니다.");
    }
}

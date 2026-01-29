package sec6;

public class PointPayment extends Payment {
    private int pointBalance;

    public PointPayment(int amount, int pointBalance) {
        super(amount);
        this.pointBalance = pointBalance;
    }

    @Override
    public void pay() {
        System.out.println("포인트 결제 처리: " + amount + "원");
        this.pointBalance -= amount;
    }

    public int getPointBalance() {
        return pointBalance;
    }
}

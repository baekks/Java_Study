package sec6;

public abstract class Payment {
    protected int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    // 공통 결제 처리
    public abstract void pay();

    public int getAmount() {
        return amount;
    }
}

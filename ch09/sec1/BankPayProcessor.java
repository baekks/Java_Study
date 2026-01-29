package sec1;

public class BankPayProcessor extends PaymentProcessor {
    private final String accountNo;

    public BankPayProcessor(int amount, String accountNo) {
        super(amount);
        this.accountNo = accountNo;
    }

    @Override
    public void processPayment() {
        System.out.println("계좌 번호: " + accountNo + "\n결제 금액: " + amount + "원");
    }
}

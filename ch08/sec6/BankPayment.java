package sec6;

public class BankPayment extends Payment {
    private String accountNumber;

    public BankPayment(int amount, String accountNumber) {
        super(amount);
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay() {
        System.out.println("계좌이체 결제 처리: " + amount + "원");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}

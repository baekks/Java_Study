package sec6;

public class CardPayment extends Payment{

    private String cardNumber;
    private String approvalCode;

    public CardPayment(int amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
        this.approvalCode = "APP-"+System.currentTimeMillis();
    }

    @Override
    public void pay() {
        System.out.println("카드 결제 처리: " + amount + "원");
        System.out.println("카드 승인 내역");
        System.out.println("카드 번호: " + cardNumber);
    }

    public String getApprovalCode() {
        return approvalCode;
    }
}

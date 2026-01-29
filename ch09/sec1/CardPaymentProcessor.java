package sec1;

// 추상메서드는 반드시 상속 받은 다음에 오버라이딩을 해야함
public class CardPaymentProcessor extends PaymentProcessor{
    private final String cardNo;

    public CardPaymentProcessor(int amount, String cardNo) {
        super(amount);
        this.cardNo = cardNo;
    }

    @Override
    public void processPayment() {
        System.out.println("카드 번호: " + cardNo + "\n결제 금액: " + amount + "원");
    }
}

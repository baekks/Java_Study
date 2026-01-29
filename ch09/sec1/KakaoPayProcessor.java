package sec1;

public class KakaoPayProcessor extends PaymentProcessor{
    private final String kakaoId;

    public KakaoPayProcessor(int amount, String kakaoId) {
        super(amount);
        this.kakaoId = kakaoId;
    }

    @Override
    public void processPayment() {
        System.out.println("카카오 계정: " + kakaoId + "\n결제 금액: " + amount + "원");
    }
}

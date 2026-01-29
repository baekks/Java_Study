package sec1;

// 추상 클래스: 공통 결제 흐름 정의
public abstract class PaymentProcessor {
    protected int amount;

    public PaymentProcessor(int amount) {
        this.amount = amount;
    }

    // 추상 메서드: 상속하고 난 다음 오버라이딩 후 사용
    public abstract void processPayment();

    // 일반 메서드: 추상 클래스에서 일반 메서드는 (공통이지만)구현 가능한 내용만 기술
    public void validateAccount() {
        if (amount <= 0) {
            throw new IllegalArgumentException("결제할 금액이 부족합니다.");
        }
        System.out.println("결제 금액 검증 완료: " + amount + "원");
    }

    // 일반 메서드: 공통 로직 결제 완료 로그
    public void logPayment() {
        System.out.println("결제 완료 로그");
    }

    // 파이널 메서드: 오버라이딩이 되지 않는다. = 상속 후에 수정할 수 없음. => 템플릿 메서드
    public final void execute() {
        validateAccount();
        processPayment();
        logPayment();
    }
}

package sec6;

public class PaymentService {
    public void process(Payment payment) {
        payment.pay();

        // CardPayment로 생성된 객체(인스턴스)인지 파악
        // 인스턴스명 instanceof 클래스명: 인스턴스가 해당 클래스로 부터 만들어진 인스턴스인지 확인
        if(payment instanceof CardPayment) {
            CardPayment card = (CardPayment) payment;   // 강제(명시적) 형 변환 => 다운 캐스팅
            System.out.println("카드 승인번호: " + card.getApprovalCode());
        } else if (payment instanceof BankPayment) {
            BankPayment bank = (BankPayment) payment;
            System.out.println("계좌번호: " + bank.getAccountNumber());
        } else if (payment instanceof PointPayment) {
            PointPayment point = (PointPayment) payment;
            System.out.println("잔여 포인트: " + point.getPointBalance());
        } else {
            System.out.println("올바른 결제 수단이 아닙니다.");
        }
    }
}

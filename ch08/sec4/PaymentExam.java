package sec4;

public class PaymentExam {
    public static void main(String[] args) {
        // 일반적인 객체 생성
        CardPayment cp1 = new CardPayment();
        cp1.pay(50000);

        // 업캐스팅 (부모의 클래스로 선언해서 자식의 클래스로 생성) = 묵시적 형 변환
        Payment p1 = new CardPayment();
        Payment p2 = new BankPayment();
        Payment p3 = new MobilePayment();
        p1.pay(30000);          // 가상 메서드(Virtual Method)
        p2.pay(40000);
        p3.pay(60000);
    }
}

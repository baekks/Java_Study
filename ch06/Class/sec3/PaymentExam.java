package sec3;

public class PaymentExam {
    public static void main(String[] args) {
        String payMethod = "KAKAO";


        Payment pay;
        if (Payment.isValidPayMethod(payMethod)) {
            String payCode = Payment.generatePaymentNo();
            pay = new Payment(payCode,"S101", "bsy", payMethod, 1000000, "DI1001");
            System.out.println(pay.toString());
        } else {
            System.out.println("올바른 결제 수단이 아닙니다.");
        }
    }
}

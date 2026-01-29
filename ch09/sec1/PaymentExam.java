package sec1;

public class PaymentExam {
    public static void main(String[] args) {
        PaymentProcessor card = new CardPaymentProcessor(30000, "111-2222-3333");
        PaymentProcessor kakao = new KakaoPayProcessor(40000, "bks0927");
        PaymentProcessor bank = new BankPayProcessor(50000, "110-12345-678910");

        System.out.println("===============카드===============");
        card.execute();
        System.out.println("==============카카오==============");
        kakao.execute();
        System.out.println("==============은행================");
        bank.execute();
        System.out.println("================끝================");
    }
}

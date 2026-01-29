package sec4;

public class MobilePayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("휴대폰 앱 결제 처리: " + amount + "원");
    }
}

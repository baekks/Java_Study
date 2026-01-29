package sec4;

public class BankPayment extends Payment{
    @Override
    public void pay(int amount) {
        System.out.println("계좌이체 결제 처리: " + amount + "원");
    }
}

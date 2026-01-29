package sec4;

public class CardPayment extends Payment{

    // 오버라이딩시에는 접근 제한자와 반환타입이 같아야 하며,
    // 매개변수의 타입과 개수가 같아야함
    @Override
    public void pay(int amount) {
        System.out.println("카드 결제 처리: " + amount + "원");
    }
    
}

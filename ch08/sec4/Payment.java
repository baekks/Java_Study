package sec4;

// 다형성: 부모 타입 하나로 여러 자식 객체를 다룰 수 있는데
// 실제 자식 객체 타입에 맞는 각기 다른 결과를 갖는
// 여러 메서드가 실행될 수 있다.
public class Payment {
    public void pay(int amount) {
        System.out.println("기본 결제 처리: " + amount + "원");
    }
}

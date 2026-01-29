package sec1;

// 완전 추상체 => 인터페이스(interface): 공통 통로
// 메서드와 같은 멤버를 선언(명시)만 하고,
// 상속받은 클래스에서 각각을 구현하여 사용하라
// 추상체: "무엇을 한다"는 고정, "어떻게 한다"는 교체가 가능하게 설계
// 구현 코드가 없게 인터페이스를 설계
public interface Interface1 {
    int method1();
    int method1(int amount);
    int method1(int amount, String msg);
}

package sec4;

// 파이널 클래스: 상속되지 않는 클래스
public final class OrderConstants {
    private OrderConstants() { }    // 객체 생성 안됨

    // 상수 => 값이 변하지 않는 공유 변수(객체 생성 X, 값 변경 X, 상속 X)
    public static final int MAX_ORDER_QUANTITY = 10;        // 최대 주문량
    public static final int DEFAULT_DELIVERY_FEE = 3000;    // 기본 배송료

    public static final String STATUS_CREATED = "CREATED";
    public static final String STATUS_PAID = "PAID";
    public static final String STATUS_SHIPPED = "SHIPPED";

    public static final String ORDER_COMPLETE_MESSAGE = "주문이 완료되었습니다.";
}

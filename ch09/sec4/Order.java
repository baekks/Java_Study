package sec4;

public class Order {
    private final String orderId;   // 주문 아이디
    private final int quantity;     // 주문수량
    private String status;          // 주문 상태

    public Order(String orderId, int quantity) {
        if (quantity > OrderConstants.MAX_ORDER_QUANTITY) {
            throw new IllegalArgumentException(
                    "최대 주문 수량은 " + OrderConstants.MAX_ORDER_QUANTITY + "입니다."
            );
        }
        this.orderId = orderId;
        this.quantity = quantity;
        this.status = OrderConstants.STATUS_CREATED;
    }

    public void pay() {
        this.status = OrderConstants.STATUS_PAID;
        System.out.println("결제 완료: " + orderId);
    }

    public void ship() {
        this.status = OrderConstants.STATUS_SHIPPED;
        System.out.println("배송 시작");
    }

    public void printSummary() {
        System.out.println("주문 번호: " + orderId);
        System.out.println("주문 수량: " + quantity);
        System.out.println("배송 상태: " + status);
        System.out.println("배송비: " + OrderConstants.DEFAULT_DELIVERY_FEE);
    }
}

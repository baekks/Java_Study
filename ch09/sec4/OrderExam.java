package sec4;

public class OrderExam {
    public static void main(String[] args) {
        // 최대 주문량, 기본 배송비 출력
        System.out.println("================기본 안내================");
        System.out.println("최대 주문 수량: "+OrderConstants.MAX_ORDER_QUANTITY);
        System.out.println("기본 배송비: "+OrderConstants.DEFAULT_DELIVERY_FEE);

        // final 필드 테스트
        Order order = new Order("AB-001", 3);
        order.printSummary();
        System.out.println();

        order.pay();
        order.printSummary();
        System.out.println();

        order.ship();
        order.printSummary();
        System.out.println();

        // final 메서드 활용
        String encrypted = PasswordEncryptor.encrypt("1234");
        System.out.println("암호화 된 비밀번호: "+encrypted);
    }
}

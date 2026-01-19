package QnA;

public class Q5_10 {
    public static void main(String[] args) {
        Order order = new Order();
        order.setNo(20240731);
        order.setId("abc123");
        order.setDate("2024년 7월 31일");
        order.setName("홍길순");
        order.setP_no("PD0345-12");
        order.setAddr("서울시 영등포구 여의도동 20번지");

        System.out.println(order.toString());
    }
}

class Order {
    private int no;
    private String id;
    private String date;
    private String name;
    private String p_no;
    private String addr;
    

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getP_no() {
        return p_no;
    }

    public void setP_no(String p_no) {
        this.p_no = p_no;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return 
                "주문번호" + no +
                "\n주문자 아이디: " + id +
                "\n주문 날짜: " + date +
                "\n주문자 이름: " + name +
                "\n주문 상품 번호: " + p_no +
                "\n배송 주소: " + addr ;
    }
}
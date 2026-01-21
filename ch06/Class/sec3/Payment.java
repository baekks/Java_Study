package sec3;

public class Payment {
    private String payNo;       // 결제번호
    private String pCode;       // 상품코드
    private String memberId;    // 회원아이디
    private String payMethod;   // 결제수단
    private int amount;         // 결제금액
    private String delCode;     // 배송코드

    // pull
    public Payment(String payNo, String pCode, String memberId, String payMethod, int amount, String delCode) {
        this.payNo = payNo;
        this.pCode = pCode;
        this.memberId = memberId;
        this.payMethod = payMethod;
        this.amount = amount;
        this.delCode = delCode;
    }

    // getter setter
    public String getPayNo() {
        return payNo;
    }
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getpCode() {
        return pCode;
    }
    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPayMethod() {
        return payMethod;
    }
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDelCode() {
        return delCode;
    }
    public void setDelCode(String delCode) {
        this.delCode = delCode;
    }

    // 결제정보 출력
    @Override
    public String toString() {
        return "Payment{" +
                "payNo='" + payNo + '\'' +
                ", pCode='" + pCode + '\'' +
                ", memberId='" + memberId + '\'' +
                ", payMethod='" + payMethod + '\'' +
                ", amount=" + amount +
                ", delCode='" + delCode + '\'' +
                '}';
    }

    // 결제번호를 자동으로 생성하는 static 메서드(generatePaymentNo)
    public static String generatePaymentNo() {
        long now = System.currentTimeMillis();  // 자역변수
        return "PAY"+now;           // this.payMethod (사용이 불가 static 메서드 내부에서 멤버 필드 변수 대입 불가)
    }

    // 결제수단 유효성 판별(isValidPayMethod) - CARD/CASH/KAKAO/NAVER
    public static boolean isValidPayMethod(String method) {

        return method.equalsIgnoreCase("CARD") ||
                method.equalsIgnoreCase("CASH") ||
                method.equalsIgnoreCase("KAKAO") ||
                method.equalsIgnoreCase("NAVER");
    }
}

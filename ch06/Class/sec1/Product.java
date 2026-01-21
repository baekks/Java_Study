package sec1;

public class Product {
    private long pno;       // 제품번호
    private String pname;   // 제품명
    private int price;      // 제품가격
    private int amount;     // 갯수
    private String std;     // 규격 단위

    // (this() => 자신의 생성자 함수, this => 자신 객체)를 활용 생성자
    // this.필드명 = > 생성자 함수 각각 실행
    // this(필드타입 필드명) => 다음 단계의 생성자를 호출 실행점을 옮김
    public Product() {
        this(0);
    }
    public Product(long pno){
        //  this.pno = pno;
        this(pno, "제품명");
    }
    public Product(long pno, String pname) {
        //  this.pno = pno;
        //  this.pname = pname;
        this(pno, pname, 10000);
    }
    public Product(long pno, String pname, int price) {
        //  this.pno = pno;
        //  this.pname = pname;
        //  this.price = price;
        this(pno, pname, price, 1);
    }
    public Product(long pno, String pname, int price, int amount) {
        //  this.pno = pno;
        //  this.pname = pname;
        //  this.price = price;
        //  this.amount = amount;
        this(pno, pname, price, amount, "규격없음");
    }
    public Product(long pno, String pname, int price, int amount, String std) {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
        this.amount = amount;
        this.std = std;
    }

    public long getPno() {
        return pno;
    }

    public void setPno(long pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", std='" + std + '\'' +
                '}';
    }
}

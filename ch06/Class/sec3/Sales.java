package sec3;

public class Sales {
    // private 클래스 변수 : 현재 클래스에서만 접근 가능
    public static Long serialNum = 1000L;
    private Long s_no;
    private String p_name;
    private int money;
    private int amount;
    final double DISCOUNT = 0.2;
    private static double tax = 0.1;
    private String buyDate;

    public Sales() {
        serialNum++;
        this.s_no = serialNum;
    }

    public Long getS_no() {
        return s_no;
    }
    public void setS_no(Long s_no) {
        this.s_no = s_no;
    }

    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static double getTax() {
        return tax;
    }
    public static void setTax(double tax) {
        Sales.tax = tax;
    }

    public String getBuyDate() {
        return buyDate;
    }
    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }
}

package sec3;

public class SalesExam {
    public static void main(String[] args) {
        Sales s1 = new Sales();
        s1.setP_name("동윤봇");
        s1.setMoney(1000000);
        s1.setAmount(2);
        s1.setBuyDate("20260120");

        // 할인액 = (단가 * 수량) * 할인율
        double discount = (s1.getMoney()*s1.getAmount())*s1.DISCOUNT;
        // 부가세 = ((단가 * 수량) - 할인액) * 부가세율
        double surtax = ((s1.getMoney()*s1.getAmount())-discount)*Sales.getTax();
        // 지불금액 = (단가 * 수량) - 할인액 + 부가세
        double payMoney = s1.getMoney()*s1.getAmount()-discount+surtax;
        System.out.println("구매하신 내역");
        System.out.println("판매코드: "+s1.getS_no());
        System.out.println("상품 금액: "+(s1.getMoney()*s1.getAmount()));
        System.out.println("할인액: "+discount);
        System.out.println("부가세: "+surtax);
        System.out.println("지불할 금액: "+payMoney);

        Sales s2 = new Sales();
        System.out.println("판매코드: " + s2.getS_no());
    }
}

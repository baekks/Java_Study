package sec1;

public class ProductExam {
    public static void main(String[] args) {
        Product p0 = new Product();
        System.out.println(p0);

        Product p1 = new Product(1L);
        System.out.println(p1);

        Product p2 = new Product(2L, "경서봇");
        System.out.println(p2);

        Product p3 = new Product(3L, "정민봇", 1000000000);

    }
}

package sec6;

public class PaymentServiceExam {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CardPayment(10000, "1004-1234-5678-1004");
        payments[1] = new BankPayment(20000, "110-12345-1004");
        payments[2] = new PointPayment(30000, 100000);

        PaymentService service = new PaymentService();
        for (Payment payment: payments) {
            System.out.println("_____________________________");
            service.process(payment);
        }
    }
}

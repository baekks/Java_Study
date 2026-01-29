package sec4;

public class PaymentServiceExam {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.process(new CardPayment(), 70000);
        service.process(new BankPayment(), 80000);
        service.process(new MobilePayment(), 90000);
    }
}

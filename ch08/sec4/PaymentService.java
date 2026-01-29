package sec4;

public class PaymentService {
    public void process(Payment payment, int amount) {
        payment.pay(amount);
    }
}

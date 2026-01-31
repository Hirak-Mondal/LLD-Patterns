package StrategyPattern;
/*
NOTE: this is best example of OPEN CLOSE PRINCIPLE
why?: Its making easier to add new strategies without tempering with the existing code.
Eg- adding another payment method like payPal is very easy without hampering the existing code

 */
interface PaymentStrategy{
    void processPayment();
}

//concrete strategy: eg- credit card, debit card, UPI
 class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Paying through credit card");
    }
}
class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Paying through debit card");
    }
}
class UPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Paying through UPI");
    }
}

class PaymentService{
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void pay(){
        strategy.processPayment();//polly morphic behaviour
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new UPI());
        paymentService.pay();
    }
}

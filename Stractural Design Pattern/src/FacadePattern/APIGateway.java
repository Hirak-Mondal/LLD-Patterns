package FacadePattern;

public class APIGateway {
    UserService userService;
    OrderService orderService;
    PaymentService paymentService;
    public APIGateway(){
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    public String getDetails(String userId, String orderId, String paymentId){
        return userService.getUserDetails(userId) + "\n" + orderService.getOrderDetails(orderId)
                + "\n" + paymentService.getPaymentDetails(paymentId);
    }
}

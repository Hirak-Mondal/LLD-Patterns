package FacadePattern;

public class FacadePattern {
    public static void main(String[] args) {
        APIGateway apiGateway = new APIGateway();
        System.out.println(apiGateway.getDetails("abc", "12847", "UPI"));
    }
}

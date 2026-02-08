package FactoryPattern;

public class TransportFactory {
    public static Transport createTransport(String type){
        return switch (type.toLowerCase()) {
            case "bike" -> new Bike();
            case "car" -> new Car();
            case "bus" -> new Bus();
            default -> throw new IllegalArgumentException("Unsupported transport type");
        };
    }
}

package FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        Transport vehicle = TransportFactory.createTransport("car");
        vehicle.delivery();
        vehicle = TransportFactory.createTransport("Bike");
        vehicle.delivery();;
        vehicle = TransportFactory.createTransport("BUS");
        vehicle.delivery();
    }
}

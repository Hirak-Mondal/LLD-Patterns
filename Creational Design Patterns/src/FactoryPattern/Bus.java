package FactoryPattern;

public class Bus implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery by bus");
    }
}

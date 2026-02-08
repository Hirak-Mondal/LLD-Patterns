package FactoryPattern;

public class Car implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery by car");
    }
}

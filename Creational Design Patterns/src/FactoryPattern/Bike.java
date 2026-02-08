package FactoryPattern;

public class Bike implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery by bike");
    }
}

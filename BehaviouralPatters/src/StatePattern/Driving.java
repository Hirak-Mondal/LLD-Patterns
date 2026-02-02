package StatePattern;

public class Driving implements TransportationMode {
    @Override
    public int calculateETA() {
        System.out.println("Calculating eta for driving:");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Calculating direction for driving";
    }
}

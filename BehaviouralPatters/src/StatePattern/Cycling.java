package StatePattern;

public class Cycling implements TransportationMode {

    @Override
    public int calculateETA() {
        System.out.println("Calculating eta for cycling:");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Calculating direction for cycling";
    }
}

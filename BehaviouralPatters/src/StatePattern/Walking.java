package StatePattern;

public class Walking implements TransportationMode {
    @Override
    public int calculateETA() {
        System.out.println("Calculating eta for walking:");
        return 15;
    }

    @Override
    public String getDirection() {
        return "Calculating direction for walking";
    }
}

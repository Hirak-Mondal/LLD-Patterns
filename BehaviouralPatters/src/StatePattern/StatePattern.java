package StatePattern;

public class StatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Driving());
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());
        directionService.setTransportationMode(new Cycling());
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());
    }
}

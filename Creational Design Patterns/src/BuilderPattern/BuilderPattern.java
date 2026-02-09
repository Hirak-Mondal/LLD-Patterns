package BuilderPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "cement", "wood")
                .setHasSwimmingPool(true)
                .build();
        System.out.println(house);
    }
}

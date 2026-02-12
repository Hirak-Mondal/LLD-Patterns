package FlyweightPattern;

///Flyweight class
public class BulletType {
    private String color; //Intrinsic properties, common for all bullets

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating a bulletType with color : " + color);
    }
}

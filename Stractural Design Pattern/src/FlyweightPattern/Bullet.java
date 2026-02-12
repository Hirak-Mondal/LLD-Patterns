package FlyweightPattern;

public class Bullet {
    private BulletType type;  //Intrinsic properties, common for all bullets
    private int x, y;     //Extrinsic properties, different for all bullers
    private int velocity;
    public Bullet(String color, int x, int y, int velocity){
        this.type = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at : (" + this.x + " , " + this.y + ") with velocity " + velocity);
    }
    public void display(){
        System.out.println("bullet at (" + x + " , " + y + ") moving forward with velocity " + velocity);
    }
}

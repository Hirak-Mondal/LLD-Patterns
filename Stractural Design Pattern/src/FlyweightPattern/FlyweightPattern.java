package FlyweightPattern;

public class FlyweightPattern {
    public static void main(String[] args) {
        //5 red bullets
        for(int i = 0; i < 5; i++){
            Bullet bullet = new Bullet("red", i, i+1, 10);
        }
        for(int i = 0; i < 5; i++){
            Bullet bullet = new Bullet("green", i*10, i*15, 10);
        }
    }
}

package FlyweightPattern;

import java.util.HashMap;

public class BulletTypeFactory {

    private static final HashMap<String, BulletType> bulletType = new HashMap<>();

    public static BulletType getBulletType(String color){
        if(!bulletType.containsKey(color)){
            bulletType.put(color, new BulletType(color));
        }
        return bulletType.get(color);
    }
}

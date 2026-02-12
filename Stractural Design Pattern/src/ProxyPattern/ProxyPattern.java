package ProxyPattern;

public class ProxyPattern {
    public static void main(String[] args) {

        // Without proxy pattern : Observe how image is loading from server
        System.out.println("-------------- Without proxy pattern -----------");
        Image without1 = new RealImage("cat.png");
        Image without2 = new RealImage("dog.png");
        without1.display();
        without1.display();

        // With proxy pattern
        System.out.println("-------------- With proxy pattern -----------");
        Image proxy1 = new ProxyImage("cat.png"); //Lazy loading
        Image proxy2 = new ProxyImage("dog.png"); //dog is not loaded from the server display() is not called

        proxy1.display();
        proxy1.display();
    }
}

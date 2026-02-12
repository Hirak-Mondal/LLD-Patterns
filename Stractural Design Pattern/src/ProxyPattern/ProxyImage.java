package ProxyPattern;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName; //we are not loading the file from server unless display() is requested
    }

    @Override
    public void display() {
        if(realImage == null){ //only loading for one instance, 2nd time give from existing instance
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

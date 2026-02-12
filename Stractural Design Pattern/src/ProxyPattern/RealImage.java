package ProxyPattern;

public class RealImage implements Image{
    public String fileName;
    public RealImage(String file){
        fileName = file;
        loadFileFromServer(); //Heavy operation to load image from server
    }
    public void loadFileFromServer(){
        System.out.println("Loading " + fileName + " from server");
    }

    @Override
    public void display() {
        System.out.println("Displaying image : " + fileName);
    }
}

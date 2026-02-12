package CompositePattern;

public class File implements FileSystemComponent{
    private final String fileName;
    public File(String fileName){
        this.fileName = fileName;
    }
    public void showDetails(){
        System.out.println("Showing file details : " + fileName);
    }
}

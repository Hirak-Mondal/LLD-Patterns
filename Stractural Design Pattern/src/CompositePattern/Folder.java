package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addComponent(FileSystemComponent fileSystemComponent){
        components.add(fileSystemComponent);
    }

    public void showDetails() {
        System.out.println("Folder : " + name);
        for(FileSystemComponent component : components){
            component.showDetails();
        }
    }
}

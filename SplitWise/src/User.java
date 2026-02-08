import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<Group> groups;
    public User(String name){
        this.name = name;
        groups = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addGroup(Group group){
        groups.add(group);
    }
    public List<Group> getGroups(){
        return groups;
    }
}

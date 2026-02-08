import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    List<User> users;
    String groupName;
    HashMap<User, Double> expense;

    public Group(String groupName) {
        this.groupName = groupName;
        users = new ArrayList<>();
        expense = new HashMap<>();
    }
    public void addUser(User user){
        if(users.contains(user)){
            System.out.println(user.getName() + " is already in the group");
            return;
        }
        users.add(user);
        expense.put(user, 0.0);
        user.addGroup(this);
    }
     public void addExpense(User user, Double amount){
        Double share = amount/ users.size();
        for(User user1 : users){
            if(user == user1){
                expense.replace(user1, expense.get(user1) - share);
            }else{
                expense.replace(user1, expense.get(user1) + share);
            }
        }
     }
     public void getExpense(){
         System.out.println(groupName + " settlement report : ");
         for (Map.Entry<User, Double> entry : expense.entrySet()) {
             if(entry.getValue() < 0){
                 System.out.println("User " + entry.getKey().getName() + " will receive : " + entry.getValue());
             }else{
                 System.out.println(
                         "User " + entry.getKey().getName() + " will pay : " + entry.getValue()
                 );
             }
         }
     }
}

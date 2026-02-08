import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Group group = new Group("lawra");
        User ayush = new User("Ayush");
        User hirak = new User("Hirak");
        User ritwik = new User("ritwik");
        group.addUser(ayush);
        group.addUser(ritwik);
        group.addUser(hirak);
        group.addUser(hirak);
        group.addExpense(ayush,1000.0);
        group.addExpense(hirak, 299.0);
        group.getExpense();

        Group group2 = new Group("g2");
        group2.addUser(hirak);
        group2.addUser(ayush);
        group2.addExpense(ayush, 100.0);

        List<Group> hirakGroups = hirak.getGroups();
        for(Group group1: hirakGroups)
                group1.getExpense();
    }
}
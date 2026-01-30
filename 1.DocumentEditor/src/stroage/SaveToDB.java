package stroage;

public class SaveToDB implements SaveData {
    @Override
    public void save(String data) {
        System.out.println("Data saved to db");
    }
}

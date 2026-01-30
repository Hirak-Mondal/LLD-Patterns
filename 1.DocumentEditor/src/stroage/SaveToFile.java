package stroage;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements SaveData {
    @Override
    public void save(String data) {
        try {
            FileWriter file = new FileWriter("document.txt");
            file.write(data);
            file.close();
            System.out.println("Data saved to file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

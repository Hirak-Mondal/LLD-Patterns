package TemplatePattern;

abstract class DataParer {
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening file");
    }
    protected void closeFile(){
        System.out.println("Closing file");
    }
    abstract void parseData();
}

class CsvParser extends DataParer {
    @Override
    void parseData() {
        System.out.println("Parsing csv data");
    }
}
class JsonParser extends DataParer {
    @Override
    void parseData() {
        System.out.println("Parsing Json data");
    }
}

public class TemplatePattern {
    public static void main(String[] args) {
        DataParer csv = new CsvParser();
        DataParer json = new JsonParser();
        csv.parse();
        json.parse();
    }
}

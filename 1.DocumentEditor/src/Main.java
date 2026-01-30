import stroage.SaveData;
import stroage.SaveToFile;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        //main functionality
        Document document = new Document();
        SaveData saveData = new SaveToFile();
        DocumentEditor documentEditor = new DocumentEditor(document, saveData);
        documentEditor.addText("Hi,");
        documentEditor.addNewLine();
        documentEditor.addText("This is a text line");
        documentEditor.addTab();
        documentEditor.addText("just tabs added");
        documentEditor.addText("yeah");
        documentEditor.addNewLine();
        documentEditor.addImg("picture.png");

        System.out.println(documentEditor.renderDocument());
        documentEditor.saveDocument();

    }
}
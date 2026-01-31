package CommandPattern;

//Command Interface
interface Command{
    void execute();
}
//Concrete classes for command interface: Bold and italic
class BoldCommand implements Command{
    private TextEditor textEditor;

    public BoldCommand(TextEditor testEditor) {
        this.textEditor = testEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}
class ItalicCommand implements Command{
    private TextEditor textEditor;

    public ItalicCommand(TextEditor testEditor) {
        this.textEditor = testEditor;
    }

    @Override
    public void execute() {
        textEditor.italicText();
    }
}

//Button class
class Button{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
     public void click (){
        command.execute();
    }

}

class TextEditor{
    public void boldText(){
        System.out.println("Text bold preformed");
    }
    public void italicText(){
        System.out.println("Text italic performed");
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        TextEditor testEditor = new TextEditor();
        Button button = new Button();
        button.setCommand(new BoldCommand(testEditor));
        button.click();

        button.setCommand(new ItalicCommand(testEditor));
        button.click();
    }
}

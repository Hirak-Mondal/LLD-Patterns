//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("Hi I'm Hirak");
        editor.setText("This is test");
        editor.setText("This is test2");

        editor.getText();
        editor.undo();
        editor.getText();
        editor.undo();
        editor.getText();
    }
}

public class TextEditor {
    Caretaker caretaker = new Caretaker();
    public void setText(String text){
        caretaker.saveSnapshot(text);
    }

    public void getText() {
        caretaker.currentText();
    }

    public void undo(){
        caretaker.removeSnapshot();
    }
}

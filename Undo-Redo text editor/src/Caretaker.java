import java.util.Stack;

public class Caretaker {
    private final Stack<Snapshot> history = new Stack<>();

    public void saveSnapshot(String text){
        Snapshot snapshot = new Snapshot(text);
        history.push(snapshot);
    }

    public void removeSnapshot(){
        if(!history.isEmpty()){
            history.pop();
        }
    }

    public void currentText(){
        if(!history.isEmpty()){
            System.out.println(history.peek().getText());
        }else {
            System.out.println("Error: there is no text saved");
        }
    }
}

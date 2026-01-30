package elements;

public class TextElm implements DocElem {
    private String text;
    public TextElm(String text){
        this.text = text;
    }
    @Override
    public String render() {
        return text;
    }
}

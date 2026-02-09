package AbstractFactoryPattern;

interface Button{
    void render();
}
interface ScrollBar{
    void scroll();
}
class MacButton implements Button{
    public void render(){
        System.out.println("Rendering mac button");
    }
}
class MacScrollbar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("Scrolling on mac");
    }
}
class WindowdsButton implements Button{
    public void render(){
        System.out.println("Rendering windows button");
    }
}
class WindowsScrollbar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("Scrolling on windows");
    }
}

//Abstract factory interface
interface UIFactory{
    Button createButton();
    ScrollBar createScrollbar();
}

class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowdsButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new WindowsScrollbar();
    }
}
class MacFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new MacScrollbar();
    }
}


public class AbstractFactoryPattern {
    private final Button button;
    private final ScrollBar scrollBar;

    public AbstractFactoryPattern(UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollbar();
    }

    public void renderUI(){
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        AbstractFactoryPattern app = new AbstractFactoryPattern(new WindowsFactory());
        app.renderUI();
    }
}

import elements.ImgElm;
import elements.NewLineElm;
import elements.TabElm;
import elements.TextElm;
import stroage.SaveData;

public class DocumentEditor {
    private Document doc;
    private SaveData save;
    private String renderedDocument = "";
    public DocumentEditor(Document doc, SaveData save){
        this.doc = doc;
        this.save = save;
    }
    public void addText(String text){
        doc.addElem(new TextElm(text));
    }
    public void addImg(String img){
        doc.addElem(new ImgElm(img));
    }
    public void addNewLine(){
        doc.addElem(new NewLineElm());
    }
    public void addTab(){
        doc.addElem(new TabElm());
    }
    public String renderDocument(){
        if(renderedDocument.isEmpty())
            renderedDocument = doc.render();
        return renderedDocument;
    }
    public void saveDocument(){
        save.save(renderedDocument);
    }
}

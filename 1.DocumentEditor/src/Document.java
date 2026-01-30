import elements.DocElem;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocElem> docElemList = new ArrayList<>();
    public void addElem(DocElem docElem){
        docElemList.add(docElem);
    }
    public String render(){
        StringBuilder result = new StringBuilder();
        for(DocElem docElem: docElemList){
            result.append(docElem.render());
        }
        return result.toString();
    }
}

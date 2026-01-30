package elements;

public class ImgElm implements DocElem {
    private String imgPath;
    public ImgElm(String img){
        this.imgPath = img;
    }
    @Override
    public String render() {
        return "[image : " + imgPath + " ]";
    }
}

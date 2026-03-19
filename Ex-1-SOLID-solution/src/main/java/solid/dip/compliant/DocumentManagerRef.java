package solid.dip.compliant;


public class DocumentManagerRef {

    private String text;
 

    public DocumentManagerRef(String text) {
        this.text = text;
   
    }

    public void addText(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }

   

  
}

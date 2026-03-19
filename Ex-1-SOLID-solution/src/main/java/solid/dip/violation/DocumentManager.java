package solid.dip.violation;


public class DocumentManager {

    private String text;
  

    public DocumentManager(String text) {
        this.text = text;
    
    }

    public void addText(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }
  

  
}

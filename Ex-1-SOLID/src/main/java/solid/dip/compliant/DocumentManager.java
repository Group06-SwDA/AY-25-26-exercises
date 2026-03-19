package solid.dip.compliant;


public class DocumentManager {

    private String text;
    private IPrinter pService;

    public DocumentManager(String text) {
        this.text = text;
        pService = new Printer();
    }

    public void addText(String text) {
        this.text += text;
    }

    public void printDocument() {
        pService.print(text);
    }

  
}

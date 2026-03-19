package solid.dip.compliant2;


public class DocumentManager {

    private String text;
    private IPrinter pService;
    private IPrinterFactory factory;

    public DocumentManager(String text) {
        this.text = text;
        factory = new PrinterFactory();
        pService = factory.creatPrinter();
    }

    public void addText(String text) {
        this.text += text;
    }

    public void printDocument() {
        pService.print(text);
    }

  
}

package solid.dip.app;

import solid.dip.compliant.*;



public class DocumentAppREF {

public static void main(String[] args) {

    IPrinterServiceFactory printerFactory = new InkPrinterFactory();
    IPrinterService printer = printerFactory.createPrinterService();

    DocumentManagerRef document = new DocumentManagerRef("Some text");
    document.addText("some other text");

    printer.print(document.getText());
   
}



}

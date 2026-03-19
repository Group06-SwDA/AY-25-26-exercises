package solid.dip.app;

import solid.dip.violation.*;

public class DocumentApp {

    public static void main(String[] args) {

        DocumentManager documentManager = new DocumentManager(" Initial text");

        PrinterService pService = new PrinterService();
    
        documentManager.addText(" More text");
        
        pService.print(documentManager.getText());
     
       }   

}
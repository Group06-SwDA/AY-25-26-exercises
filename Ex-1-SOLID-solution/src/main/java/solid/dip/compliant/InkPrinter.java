package solid.dip.compliant;

public class InkPrinter implements IPrinterService {

    @Override
    public void print(String text) {
        // simulate sending text to ink printer
        System.out.println( System.lineSeparator() + text + System.lineSeparator() + " printed using Ink Printer" + System.lineSeparator()  );
    }

}

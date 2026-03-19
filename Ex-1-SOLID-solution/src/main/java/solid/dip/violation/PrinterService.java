package solid.dip.violation;

public class PrinterService {
    Printer printer;

    public PrinterService() {
        printer = new Printer();
    }

    public void print(String text) {
        printer.print(text);
    }
}

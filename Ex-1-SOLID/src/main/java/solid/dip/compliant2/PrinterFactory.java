package solid.dip.compliant2;

public class PrinterFactory implements IPrinterFactory{
    @Override
    public IPrinter createPrinter(){
        return new Printer();
    }
}

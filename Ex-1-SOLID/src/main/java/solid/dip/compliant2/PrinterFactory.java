package solid.dip.compliant2;

public class PrinterFactory implements IPrinterFactory{
    @Override
    public IPrinter creatPrinter(){
        return new Printer();
    }
}

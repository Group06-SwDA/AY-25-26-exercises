package solid.dip.compliant;

public class InkPrinterFactory implements IPrinterServiceFactory {

    @Override
    public IPrinterService createPrinterService() {
        return new InkPrinter();
    }

}

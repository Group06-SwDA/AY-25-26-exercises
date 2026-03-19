package solid.dip.compliant2;

public class Printer implements IPrinter{

    @Override
    public void print(String text) {
        // simulate sending text to printer
        System.out.println(text);
    }

}

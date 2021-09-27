import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void hasSheetsRemaining() {
        assertEquals(100, printer.getSheetsRemaining());
    }

    @Test
    public void canPrintSheetsTrue() {
        assertEquals(true, printer.printSheets(10, 2));
    }

    @Test
    public void canPrintSheetsFalse() {
        assertEquals(false, printer.printSheets(1000, 2));
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void checkTonerDecreases() {
        printer.printSheets(10, 2);
        assertEquals(30, printer.getToner());
    }

    @Test
    public void checkPaperDecreases() {
        printer.printSheets(10, 2);
        assertEquals(80, printer.getSheetsRemaining());
    }
}

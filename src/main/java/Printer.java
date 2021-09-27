public class Printer {

    private int sheetsRemaining;
    private int toner;

    public Printer(int sheetsRemaining, int toner) {
        this.sheetsRemaining = sheetsRemaining;
        this.toner = toner;
    }

    public int getSheetsRemaining() {
        return this.sheetsRemaining;
    }

    public boolean printSheets(int pages, int copies) {
        int totalPagesToPrint = pages * copies;
        if (totalPagesToPrint <= this.sheetsRemaining) {
            this.sheetsRemaining -= totalPagesToPrint;
            this.toner -= totalPagesToPrint;
            return true;
        } else {
            return false;
        }
    }

    public int getToner() {
        return this.toner;
    }
}

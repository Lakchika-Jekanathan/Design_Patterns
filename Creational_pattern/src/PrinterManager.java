public class PrinterManager {
    private static PrinterManager printerManager;
    private PrinterManager() {
        // Initialize printer connection
    }
    public static PrinterManager getInstance() {
        if (printerManager == null) {
            printerManager = new PrinterManager();
        }
        return printerManager;
    }
    public void printDocument(String document) {
        System.out.println("Printing: " + document);
    }
}
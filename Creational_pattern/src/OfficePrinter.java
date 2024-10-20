public class OfficePrinter {
    public static void main(String[] args) {
        PrinterManager printer1 = PrinterManager.getInstance();
        PrinterManager printer2 = PrinterManager.getInstance();

        printer1.printDocument("Employee Handbook");
        printer2.printDocument("Report");
    }
}
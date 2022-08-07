package maliyat;

public class Main {
    public static void main(String[] args) {
        Taxcalculator calculator = new TaxCalculator1(100_000);
        TaxReport report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2());
       // report.show(calculator);
       // report.setCalculator(new TaxCalculator2());
       // report.show();
    }

}

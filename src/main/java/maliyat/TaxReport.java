package maliyat;

public class TaxReport {

 //   private Taxcalculator calculator;

//    public TaxReport(Taxcalculator calculator){
//        this.calculator =  calculator;
//    }

    public void show(Taxcalculator calculator){
         double tax = calculator.calculateTax();
        System.out.println(tax);
    }
//    public void setCalculator(Taxcalculator calculator) {
//        this.calculator = calculator;
//    }
}

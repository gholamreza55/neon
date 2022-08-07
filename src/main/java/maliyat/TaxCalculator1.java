package maliyat;

public class TaxCalculator1 implements Taxcalculator{
    private double taxalebIncome;


    public TaxCalculator1(double taxalebIncome) {
        this.taxalebIncome = taxalebIncome;
    }

    @Override
    public double calculateTax(){
        return taxalebIncome * 0.4;
    }

}

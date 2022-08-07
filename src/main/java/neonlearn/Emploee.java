package neonlearn;

public class Emploee {
    public int basesalary ;
    private int hourlyrate ;
    public static int numberofEmployee;


    public Emploee(int basesalary, int hourlyrate) {
        this.basesalary = basesalary;
        this.hourlyrate = hourlyrate;
        numberofEmployee ++;
    }

    public static void  printNumberofEmployee(){
        System.out.println(numberofEmployee);
        new Emploee(21,21).calculator(12);

    }

    private int getBasesalary() {
        return basesalary;
    }

    private void setBasesalary(int basesalary) {
        if (basesalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.basesalary = basesalary;
    }

    public int calculator(int exrahoure){
        return basesalary + (exrahoure * getHourlyrate());
    }

    public int calculator(){
        return calculator(0) ;
    }

    private int getHourlyrate() {
        return hourlyrate;
    }

    private void setHourlyrate(int hourlyrate) {
        if (hourlyrate <= 0)
            throw new IllegalArgumentException("hourlyrate cannot be 0 or less");
        this.hourlyrate = hourlyrate;
    }
}

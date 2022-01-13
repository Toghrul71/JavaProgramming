package day31_Tasks;

public class SalaryCalculator {
    public double hourlyrate, stateTaxRate,federalTaxRate, weeklyHours ;

    public SalaryCalculator(double hourlyrate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyrate = hourlyrate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary=hourlyrate*weeklyHours*52;
        return salary;
    }
    public double stateTax(){
        double totalStateTax=(stateTaxRate*salary())/100;
        return totalStateTax;
    }
    public double federalTax(){
        double totalFederalTax= (federalTaxRate*salary())/100;
        return totalFederalTax;
    }
    public double salaryAfterTax(){
        double salaryAfterTax=salary()-stateTax()-federalTax();
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}

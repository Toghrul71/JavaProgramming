package day19_LoopPractices;

import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("How much you make an hour?");
            double hourlyrate= input.nextDouble();

            if (hourlyrate==0 || hourlyrate<0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            double hoursPerWeek= input.nextDouble();

            if(hoursPerWeek<1 || hoursPerWeek>144){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double statetaxRate= input.nextDouble();

            if(statetaxRate<0 || statetaxRate>10){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double grossSalary=hourlyrate*hoursPerWeek;
            double federalTax=grossSalary*0.26;
            double totalTax= statetaxRate*grossSalary+federalTax;
            double netIncome= grossSalary-federalTax-(statetaxRate*grossSalary);


            System.out.println("Gross salary: "+grossSalary);
            System.out.println("Federal tax: "+federalTax);
            System.out.println("State tax: "+ (grossSalary*statetaxRate));
            System.out.println("Total tax: "+ totalTax);
            System.out.println("Net income: "+netIncome);


            System.out.println("Would you like to continue?");
            String continuee=input.next();


            while (!(continuee.equalsIgnoreCase("yes")|| continuee.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (continuee.equalsIgnoreCase("yes")){
                continue;
            }
            else {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }






        }
        input.close();
    }
}

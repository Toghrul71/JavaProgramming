package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        String gender="";
        String married="";
        int age=0;
        int mileage=5;
        String typeOfInsurance="";
        String accidentsOrClaimsAnswer = "";
        String antiTheftDeviceAnswer="";

        int basePriceForLiability=0;
        int priceForMilesLiability=0;
        int basePriceForFullCoverage=0;
        int priceForMilesFullCoverage=0;

        int total=0;



        System.out.println("Enter your gender");
        gender= input.next().toLowerCase();

        while (!(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female"))){
            System.out.println("Invalid entry, please re enter male or female");
            gender=input.next().toLowerCase();
        }

        System.out.println("Are you married?");
        married=input.next().toLowerCase();


        while (!(married.toLowerCase().equals("yes") || married.toLowerCase().equals("no"))){
            System.out.println("Invalid entry, please enter yes or no");
            married= input.next();
        }

        System.out.println("Enter your age");
        age= input.nextInt();


        while (!(age>0 && age<120)){
            System.out.println("Invalid entry, please enter valid age must be greater than zero" +
                    " and less than 120");
            age= input.nextInt();
        }

        System.out.println("How many miles do you drive a day?");
        mileage= input.nextInt();

        while (!(mileage>5)){
            System.out.println("Invalid entry, please enter valid mileage greater than 5 miles");
            mileage= input.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance?");
        typeOfInsurance=input.next();



        System.out.println("Did you have accidents or claims in past 5 years? Yes/No");
        accidentsOrClaimsAnswer=input.next().toLowerCase();


        while (!(accidentsOrClaimsAnswer.equalsIgnoreCase("yes") ||
                accidentsOrClaimsAnswer.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry, please enter yes or no");
            accidentsOrClaimsAnswer=input.next().toLowerCase();
        }
        System.out.println("Do you have anti-theft device? yes/no");
        antiTheftDeviceAnswer=input.next().toLowerCase();


        while (!(antiTheftDeviceAnswer.equalsIgnoreCase("yes") ||
                antiTheftDeviceAnswer.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry, please enter valid answer: yes/no");
            antiTheftDeviceAnswer=input.next().toLowerCase();
        }



        if(married.toLowerCase().equals("yes") && antiTheftDeviceAnswer.toLowerCase().equals("yes") &&
        accidentsOrClaimsAnswer.toLowerCase().equals("yes") && typeOfInsurance.toLowerCase().equals("liability insurance")){



        }
    }
}


/*
if(typeOfInsurance.toLowerCase().equals("liability insurance")){
            if(age<25){
                basePriceForAge=90;
            }else {
                basePriceForAge=50;
            }if(mileage<=10){
                priceForMiles=10;
            }else if(mileage>10 && mileage<=50){
                priceForMiles=30;
            }else {
                priceForMiles=50;
            }
            if(typeOfInsurance.toLowerCase().equals("full coverage")){
                if(age<25){
                    basePriceForAge=160;
                }else {
                    basePriceForAge=120;
                }if(mileage<=10){
                    priceForMiles=20;
                }else if(mileage>10 && mileage<=40){
                    priceForMiles=30;
                }else {
                    priceForMiles=70;
                }


                 if(accidentsOrClaimsAnswer.toLowerCase().equals("yes")){
            total=total+total*0.15;
        }else {
            total=total-total*.10;
        }

        if(antiTheftDeviceAnswer.toLowerCase().equals("yes")){
            total=total-total*0.05;
        }
 */
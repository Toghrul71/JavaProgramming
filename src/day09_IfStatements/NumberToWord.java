package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {

        int a = 7;


        boolean ifItsZero = a==0;
        boolean ifItsOne = a==1;
        boolean ifItsTwo = a==2;
        boolean ifItsThree = a==3;
        boolean ifItsFour = a==4;
        boolean ifItsFive = a==5;
        boolean ifItsSix = a==6;
        boolean ifItsSeven = a==7;
        boolean ifItsEight = a==8;
        boolean ifItsNine = a==9;

        if(ifItsZero) {
            System.out.println("Zero");
        }
        if(ifItsOne) {
            System.out.println("One");
        }

        if(ifItsTwo) {
            System.out.println("Two");
        }

        if(ifItsThree) {
            System.out.println("Three");
        }

        if(ifItsFour) {
            System.out.println("Four");
        }

        if(ifItsFive) {
            System.out.println("Five");
        }

        if(ifItsSix) {
            System.out.println("Six");
        }
        if(ifItsSeven) {
            System.out.println("Seven");
        }

        if(ifItsEight) {
            System.out.println("Eight");
        }
        if(ifItsNine) {
            System.out.println("Nine");
        }




    }
}

    //Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        //Ex:
        //number = 1;

        //output:
        //One
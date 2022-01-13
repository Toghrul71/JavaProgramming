package day23_CustomeMethodsIntro;

import java.util.Scanner;

public class CustomMethodsWithsParameters {
    public static void main(String[] args) {

        evenOrOdd(5);  // the method needs number inside parentheses ( )
        ageOfThePerson(1985);
        numbersBetweenXAndY(5,9);


    }

    // check if a number odd or even
    public static void evenOrOdd(int number){  // parameter needs to be given in parentheses (5)
        if(number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }

    //calculate the age of the person

    public static void ageOfThePerson(int year){

        int age = 2021-year;

        System.out.println("Age is: "+age);

    }

    //  pritn all numbers between X and Y

    public static void numbersBetweenXAndY(int x, int y){

        for (int i = x; i <=y ; i++) {

            System.out.println(i);

        }
    }

}

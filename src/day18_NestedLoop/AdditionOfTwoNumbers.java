package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){


        System.out.println("Enter a first number");
        int number1 = input.nextInt();
        System.out.println("Enter a second number");
        int number2= input.nextInt();

        System.out.println("Addition is: " + (number1+number2));

            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("Invalid Entry, Please re enter");
                answer= input.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }

        }
    }
}

package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number?");
            String answer = input.next();

            if(!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you!");
                break;
            }

        }
    }
}

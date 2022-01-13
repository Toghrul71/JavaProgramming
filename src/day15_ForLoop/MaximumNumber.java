package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximumNumber = -2147483648; // any user entered number will be greater than -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number>maximumNumber){ // if the user entered number is greater than current maximum number
                maximumNumber=number;

            }

        }


        System.out.println("Maximum number= "+maximumNumber);
    }
}

/*
ask user to enter a number for 5 times
 */

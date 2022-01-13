package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minimumNumber =2147483647;

        for(int i =10;i<15; i++){
            System.out.println("Enter a number");
            int number= input.nextInt();

            if(number<minimumNumber){
                minimumNumber=number;
            }
        }
        System.out.println("Minimum number= " + minimumNumber);
    }
}

/*
ask user to enter 5 numbers then print minimum number
 */
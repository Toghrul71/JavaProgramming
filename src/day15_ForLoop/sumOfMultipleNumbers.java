package day15_ForLoop;

import java.util.Scanner;

public class sumOfMultipleNumbers {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <=100 ; i++) {
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("-----------------------------");




        int total = 0;

        Scanner input = new Scanner(System.in);



        for(int i =0; i<5; i++){
            System.out.println("Enter a number");
            total += input.nextInt();
        }


        System.out.println(total);

            input.close();
    }
}

//find sum of numbers 1 to 100
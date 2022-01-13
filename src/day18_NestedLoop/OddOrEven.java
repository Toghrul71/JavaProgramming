package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){ // outer loop means while yes


        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println(number+ " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

        System.out.println("Would you like to enter another number");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry, please re enter");
            answer= input.next().toLowerCase();
        }

        if(answer.equals("no")){
            break;
        }


    }
}
}
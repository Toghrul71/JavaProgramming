package Day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age>=20)){ // while the age is not equal or greater than 20
            System.err.println("Invalid entry, please re enter");
            age = input.nextInt();
        }
        System.out.println("Are you a Canadian citizen? yes/no");
        String answer = input.next();

        while (  !(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no") )   ){
            System.err.println("Enter a valid entry, it should be yes or no");
            answer = input.next();
        }
        System.out.println("You are eligible");

    }
}

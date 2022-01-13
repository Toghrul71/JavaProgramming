package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        while (true){
            System.out.println("Enter your age");
            int age = input.nextInt();

            while (!(age>=18)){  // while the age is valid
                System.err.println("Invalid Entry, Please re enter your age");
                age= input.nextInt();


            }

            System.out.println("Would you like to continue"); //
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){  // while the answer is invalid
                System.err.println("Invalid entry, please re enter. Would you like to continue");
                answer= input.next().toLowerCase();
            }


            if(answer.equals("no")){
                break;
            }

        }






            input.close();

    }


}

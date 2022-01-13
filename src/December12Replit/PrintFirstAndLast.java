package December12Replit;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};



        for (String eachWord : words) {

            System.out.println(eachWord.charAt(0)+eachWord.substring(eachWord.length()-1)+" ");

        }


    }

}

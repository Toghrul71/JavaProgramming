package day16_ForLoopString;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word"); // Wooden Spoon
        //  123456789..11 . Total 11 characters (last index number is 11)
        String word = input.next();

        String result = "";


        for (int i = word.length()-1; i >= 0; i--){

            result += word.charAt(i);




        }
        System.out.print(result);
    }
}
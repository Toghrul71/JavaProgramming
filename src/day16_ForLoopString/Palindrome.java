package day16_ForLoopString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            reversed+=""+word.charAt(i);
            if(reversed.equalsIgnoreCase(word)){
                System.out.println("is palindrome");
            }


        }


        }

    }



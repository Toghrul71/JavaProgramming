package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
        if(word.charAt(0)=='x'){
           word = word.replace("x","a"); // new string will be starting with "a"
        }
        System.out.println(word);
    }
}

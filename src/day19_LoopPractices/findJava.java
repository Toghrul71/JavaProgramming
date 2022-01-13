package day19_LoopPractices;

import java.util.Scanner;

public class findJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        int count = 0;

        for (int i = 0; i <=word.length()-4 ; i++) {

            if(word.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

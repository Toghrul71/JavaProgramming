package day22_MultiDimensionalArray;

import java.util.Arrays;

public class reverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] words = sentence.split(" ");

        String reversed = "";

        for (int i = words[2].length()-1; i >= 0; i--) { // reversing index 1 (love)

            reversed += words[1].charAt(i);




        }
        System.out.println(words[0]+" "+reversed+" "+words[2]);
    }
}
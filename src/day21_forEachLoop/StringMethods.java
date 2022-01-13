package day21_forEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Java";
        char[] characters = word.toCharArray();

        System.out.println(Arrays.toString(characters));

        for(char each: characters);{
            System.out.println("");
        }

    }
}

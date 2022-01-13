package day21_forEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "acdb";
        String word2 = "dbca";

        char[] newWord1 = word1.toCharArray();
        char[] newWord2= word2.toCharArray();

        Arrays.sort(newWord1);
        Arrays.sort(newWord2);

        boolean isAnagram = Arrays.equals(newWord1,newWord2);

        System.out.println(isAnagram);






    }
}

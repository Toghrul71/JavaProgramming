package WednesdaDecember29;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean isA=isAnagram("ana","an"); // aaccerR
        System.out.println(isA);

    }
    public static boolean isAnagram(String word1, String word2){
        String[] sorted1=word1.split("");
        Arrays.sort(sorted1);
        //String[] reversed=new String[sorted.length];
        String[] sorted2=word2.split("");
        Arrays.sort(sorted2);

        return Arrays.equals(sorted1,sorted2);


    }
}

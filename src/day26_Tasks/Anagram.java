package day26_Tasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean issAnagram=isAnagram("listen", "silent");
        System.out.println(issAnagram);
    }


    public static boolean isAnagram(String word1, String word2) {

        boolean isAnagram=false;
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
        isAnagram=true;
        }else {
            isAnagram = false;

        }
        return isAnagram;
    }

}

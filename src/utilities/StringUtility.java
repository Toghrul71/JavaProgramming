package utilities;

import java.util.Arrays;

public class StringUtility {

    // This method is prints each character of given string
    public static void printEachChar(String str){  // there is no value to return so its void

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i));
        }
    }

    // access modifier    specifier // this method reverses given String and returns reversed String
        public            static     String reverse(String str){ // its not void because there is value to be returned- result-
        String result="";

            for (int i = str.length()-1; i >=0 ; i--) {
                result+=str.charAt(i);

            }
            return result;

    }

    // checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){

        return reverse(str).equalsIgnoreCase(str);

    }

    public static boolean anagram(String word1, String word2){  // "acb", "bca"

        char[] ch1= word1.toCharArray(); // convert to array
        char[] ch2=word2.toCharArray();

        Arrays.sort(ch1); // sort characters
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);



    }

    //removes duplicates from a string
    public static String removeDuplicates(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result+=each;
            }

        }
        return result;
    }
    }



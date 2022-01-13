package day16_ForLoopString;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = "aabbaacc";
                     //01234567

        String result="";   // result should be: abc

        for (int i = 0; i <=word.length() -1; i++) {   //i: represents index numbers starting from 0
            String ch =""+word.charAt(i); // represents each character of word


            if(!result.contains(ch)){ // if the character is not contained in the result
                result+=ch;          //  the character will be added to the result
            }
        }// no print statements before the loop
        System.out.println(result);
    }
}

package December12Replit;

import java.util.Arrays;

public class reverseSentencenew {
    public static void main(String[] args) {

        String sentence= "Today is a good day to learn Java";

        String[] newSentence = sentence.split(" ");


        for (int i = newSentence.length-1; i >=0 ; i--) {

            System.out.print(newSentence[i]+" ");
        }


    }
}

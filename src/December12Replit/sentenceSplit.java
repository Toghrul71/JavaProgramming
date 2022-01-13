package December12Replit;

import java.util.Arrays;
import java.util.Scanner;

public class sentenceSplit {
    public static void main(String[] args) {



    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();

    //type your code below
    String[] sentenceArray= sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {

            System.out.println(sentenceArray[i]);
        }
input.close();

}
}
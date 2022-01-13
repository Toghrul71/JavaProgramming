package day21_forEachLoop;

import java.util.Arrays;

public class ArraySplit {
    public static void main(String[] args) {

        String sentence = "Wooden Spoon";

        String[] newSentence =sentence.split(" ");

        System.out.println(Arrays.toString(newSentence));

        System.out.println("---------------------------------");

        String email = "WoodenSpoon@cydeo.com";
        String[] emailSplit= email.split("@");
        System.out.println(Arrays.toString(emailSplit));

        System.out.println("-------------------------------");

        String sentence2= "Today is nice. Today is Monday. Today we learn java";

        String[] newSentence2 = sentence2.split("\\.");
        System.out.println(Arrays.toString(newSentence2));

    }
}

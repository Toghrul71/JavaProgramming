package day28Tasks;

import java.util.Arrays;

public class retrieveLettersDigits {
    public static void main(String[] args) {

        String word = "Wooden Spoon@2021";

        char[] ch = word.toCharArray();
        String letters ="";
        String digits="";
        String specialChars="";

        for (char each:ch){
            if(Character.isLetter(each)){
               letters+=""+each;
            }else if (Character.isDigit(each)){
                digits+=""+each;
            }else {
                specialChars+=""+each;
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Special characters: "+specialChars);
    }
}

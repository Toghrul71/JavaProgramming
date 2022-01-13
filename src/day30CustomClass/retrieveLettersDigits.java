package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class retrieveLettersDigits {
    public static void main(String[] args) {
        String str= "alkcn79@@6998";


        ArrayList<Character> chars=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character>letters=new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character>specialChars=new ArrayList<>(chars);
        specialChars.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println(specialChars);



    }
}

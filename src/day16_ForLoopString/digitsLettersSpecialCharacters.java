package day16_ForLoopString;

public class digitsLettersSpecialCharacters {
    public static void main(String[] args) {
        String word = "Cydeo123456School!@#$%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoWoodenSpoon
        String specialChars = ""; //@#$%^&*

        for (int i = 0; i < word.length() ; i++) {

            char ch=word.charAt(i); // ch: represents each character in the string word

            if(ch>='0' && ch<='9'){ // character is more than 0 and less than 9 ASCII table
                digits+=ch;
            }else if(ch>='A' && ch<='Z'){ // character is more than A and less than Z ASCII table
                letters+=ch;
            }else if(ch>='a' && ch<='z') { // character is more than a and less than z ASCII table
                letters+=ch;
            }else {                         // character is special character
                if(ch!=' ')             // if the character is not a space
                specialChars+=ch;
            }

        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);

    }
}

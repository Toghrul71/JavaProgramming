package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password ="Cdhkhk@16";

        int countUpperCase=0;
        int countLowerCase=0;
        int countDigits=0;
        int countSpecialChars=0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else {
                countSpecialChars++;
            }

        }

        if (password.length()>=8 && !password.contains(" ")&&countUpperCase>=1 && countLowerCase>=1 && countDigits>=1 &&countSpecialChars>=1){
            System.out.println("Strong password");
        }else {
            System.out.println("Not strong password");
        }
    }
}

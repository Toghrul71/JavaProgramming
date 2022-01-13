package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {


        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // if password has UpperCase letter its true
        boolean r3 = false; // if password has lowerCase letter its true
        boolean r4 = false;// if password has special character its true
        boolean r5 = false;// if password has digit its true

        char[] chars = password.toCharArray();

        for (char each:chars){
            if(Character.isUpperCase(each)){
                r2=true;
            }
            else if(Character.isLowerCase(each)){
                r3=true;
            }
           else if (Character.isDigit(each)){
                r5=true;
            }else { // if special char
               r4=true;
            }
        }

        boolean isStrongPassword=r1&&r2&&r3&&r4&&r5;
        System.out.println(isStrongPassword);

        // check through the custom method
        String passwoord= "Cydeo1990@";
        isStrongPassword(passwoord);  // custom method

    }




    public static boolean isStrongPassword (String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // if password has UpperCase letter its true
        boolean r3 = false; // if password has lowerCase letter its true
        boolean r4 = false;// if password has special character its true
        boolean r5 = false;// if password has digit its true

        char[] chars = password.toCharArray();

        for (char each:chars){
            if(Character.isUpperCase(each)){
                r2=true;
            }
            else if(Character.isLowerCase(each)){
                r3=true;
            }
            else if (Character.isDigit(each)){
                r5=true;
            }else { // if special char
                r4=true;
            }
        }

        boolean isStrongPassword=r1&&r2&&r3&&r4&&r5;
        System.out.println(isStrongPassword);

        return isStrongPassword;
    }

}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */
package day16_ForLoopString;

import java.util.Locale;
import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.next();

        String firstName = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
        String firstLetterOflastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase(Locale.ROOT);
        String lastName = email.substring(email.indexOf("_")+2,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + firstLetterOflastName+lastName);
        System.out.println("Domain: " + domain);


    }
}

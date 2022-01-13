package December12Replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] emailArray = email.split("@");
        int count = 0;

        if (email.contains("@")) {
            count++;
        }
            if (email.contains("@") && count == 1) {
                System.out.println("Email id: " + emailArray[0]);
                System.out.println("Email domain: " + emailArray[1]);

            }
            if (!email.contains("@") || count > 1 ) {
                System.out.println("Invalid email");
            }


        }
    }

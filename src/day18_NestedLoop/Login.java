package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you username");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        int attempts;

        if(username.equalsIgnoreCase("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {
            attempts=3;
            for (int i = 0; i < attempts; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter username");
                username= input.next();
                System.out.println("Enter password");
                password= input.next();



                if(username.equalsIgnoreCase("Cydeo") && password.equals("WoodenSpoon")){
                    System.out.println("Logged in");
                    break;
                }

                if(!(username.equalsIgnoreCase("Cydeo")&& password.equals("WoodenSpoon"))){
                    System.out.println("Account Locked");
                }


            }
            input.close();
        }
    }
}

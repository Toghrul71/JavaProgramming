package Day17_While_DoWhile;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        System.out.println("Enter password");

        for (int i = 1; i <= 3; i++) {
            String username = input.next();
            String password = input.next();
            if(i==3) {
                System.out.println("Your account is locked");

            }if (username.equals("Cydeo")&& password.equals("Cydeo123")){
                    System.out.println("Logged in");

            }    else{

                System.out.println("Try again");
        }

         }

        }


    }


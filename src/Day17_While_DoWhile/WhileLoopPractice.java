package Day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username and password");
        String username = input.next();
        String password = input.next();


        if(username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("You are logged in");
        }else {
            int attempt = 3; // 3, 2, 1

            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt>0 ){
                // when username and password is invalid and it stops asking when attempt is greater than 0.

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                username= input.next();
                System.out.println("Enter your password");
                password= input.next();

                attempt--;

            }
            if (attempt==0){
                System.out.println("Your account is locked");
            }
        }
        input.close();

        }
        //while (invalid && hasAttempts)

    }




// username: "Cydeo"
// password: "Cydeo123"

//if user enters correctly print logged in amd give 3 attemptes
//if user enters invalid print invalid
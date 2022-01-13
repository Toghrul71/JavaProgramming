package December12Replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmailnew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.nextLine(); // It is not array?  //info@cybertekschool.com

            // [info]   [cybertekschool.com]
                    // array has 2 indexes in this case        0              1

            int count=0;  // if more than 1 @@ or less than 1 is there then "Invalid email"
        for (int i = 0; i < email.length(); i++) {

                if(email.charAt(i)=='@') { // eger @ isaresi varsa say
                    count++;
                }
                }
                if(count==1){
                    String[] emailSplit = email.split("@");
                    System.out.println("UserId:" +emailSplit[0]);  // info
                    System.out.println("Domain is: "+emailSplit[1]);// cybertekschool.com
                }else {// if <0 or >0 or doesnt contain @
                    System.out.println("Invalid email");
                }


                }


        }








//Given a String variable email, write code using split method to print email id and domain in separate lines.
/*Example:

        email -> info@cybertekschool.com

Output:
        Email id: info
        Email domain: cybertekschool.com
        email -> info@cybertekschool.com

Output:
        Email id: info
        Email domain: cybertekschool.com
        If email contains no @ character or multiple @ characters then print invalid email:
        */

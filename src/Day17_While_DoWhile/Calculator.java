package Day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1= input.nextInt();

        System.out.println("Enter your second number:");
        int num2= input.nextInt();

        System.out.println("Enter a math operator:");
        char ch = input.next().charAt(0);  // +,-

        while (   !(ch=='+' || ch=='-') ){ // if ch doesnt equal to + or - then
            System.err.println("invalid Operator, Please re-enter"); // then print this, until ch either + or -
            ch = input.next().charAt(0);

        }
        System.out.println( (ch=='+')? num1+num2:num1-num2 );
    }
}

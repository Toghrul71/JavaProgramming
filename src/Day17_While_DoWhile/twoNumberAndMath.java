package Day17_While_DoWhile;

import java.util.Scanner;

public class twoNumberAndMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers and a math operator");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        char mathOperator = scan.next().charAt(0);
        int result = 0;

        while (!(mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/')) {
            System.out.println("Please re enter operator");
            mathOperator = scan.next().charAt(0);
        }
        if (mathOperator == '+') {
            result = number1 + number2;
        } else if (mathOperator == '-') {
            result = number1 - number2;
        } else if (mathOperator == '*') {
            result = number1 * number2;

        }else if (mathOperator == '/') {
            result = number1 / number2;

        }
        System.out.println("result is: " + result);
    }
}
/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides
		 a valid operator (+, -, *, /)

 */
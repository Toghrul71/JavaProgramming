package day26_Tasks;
import java.util.Scanner;
public class simpleCalculator {
    static class Main {

        public static void main(String[] args) {
            plus();
        }

        // Do not touch above

        public static void plus() {

            //your code here
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int result = number1 + number2;
            System.out.println("result: " + result);
        }
    }
    }
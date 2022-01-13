package day09_IfStatements;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 15;
        boolean isDivisibleBy3 = number % 3 == 0 && number % 5 >0;
        boolean isDivisibleBy5 = number % 5 == 0 && number % 3 >0;
        boolean isDivisibleBoth3and5 = number % 3 == 0 && number % 5 ==0;

        if(isDivisibleBy3) {

            System.out.println("Fizz");
        }

        else if(isDivisibleBy5) {

            System.out.println("Buzz");

        }
        if(isDivisibleBoth3and5) {
            System.out.println("FizzBuzz");
        }

    }
}



//Create a class called FizzBuzz, an integer variable named number is given to you,
// write a program that prints "Fizz" if the number is divisible by 3,
// prints "Buzz" if the number is divisible by 5,
// and prints FizzBuzz if the number is divisible by both 3 and 5.
//
//            Ex:
//                number 15
//
//            Output:
//                FizzBuzz
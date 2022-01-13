package Day17_While_DoWhile;

import java.util.Scanner;

public class twoPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum =0;

        if((num1>=0 && num2>=0)){
            sum=num1+num2;

        }
        while (!(num1>=0 && num2>=0)){
            System.out.println("Please re enter");
            num1= input.nextInt();
            num2= input.nextInt();
        }
        System.out.println(sum);
    }
}

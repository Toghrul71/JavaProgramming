package Day17_While_DoWhile;

import java.util.Scanner;

public class sumOf2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int sum = 0;

        for (int i = 0; i < number1; i++) {

            sum+=number2; //if 0 and 1 and 2 are less than number1 then 3 times adding :0+4+4+4
        }
        System.out.println(sum);
    }
}

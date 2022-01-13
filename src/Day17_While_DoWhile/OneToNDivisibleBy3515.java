package Day17_While_DoWhile;

import java.util.Scanner;

public class OneToNDivisibleBy3515 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();

        String div15 = "";
        String div5 = "";
        String div3 = "";
        int num = 0;
        System.out.println("Enter number");
        num = input.nextInt();
        //if (num % 15 == 0) {
        for (int i = 1; i <= num; i++) {

            if (i % 15 == 0) {
                div15 += " " + i;
            }
            if (i % 5 == 0 && !(i % 3 == 0)) {
                div5 += " " + i;
            }
            if (i % 3 == 0 && !(i % 5 == 0)) {
                div3 += " " + i;
            }

        }
        System.out.println("Divisible By 15 are: " + div15);
        System.out.println("Divisible By 5 are: " + div5);
        System.out.println("Divisible By 3 are: " + div3);
    }
}



package day11;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your score");

        int score = input.nextInt();



        if (score > 0 && score < 100) {
            System.out.println("Score = " + score);


        } else {
            System.out.println("Invalid score");
        }
        input.close();
    }
}
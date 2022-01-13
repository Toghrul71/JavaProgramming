package day19_LoopPractices;

import java.util.Scanner;

public class areaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter the radius of the circle:");
            int radius = input.nextInt();

            if(radius<=0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            double diameter = radius*2;
            double area= 3.14*radius*radius;
            double perimeter = diameter*3.14;




        }

    }
}

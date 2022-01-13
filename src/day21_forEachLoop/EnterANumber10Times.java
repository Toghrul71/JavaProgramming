package day21_forEachLoop;

import java.util.Scanner;

public class EnterANumber10Times {
    public static void main(String[] args) {


        int[] numbers = {1,2,3};
        int max=numbers[1];
        int min = numbers[1];


        for (int i = 0; i < numbers.length; i++) {


            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }


        }
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
    }
}

package day20_Arrays;

import java.util.Scanner;

public class EnterNumber10Times {
    public static void main(String[] args) {

        int [] numbers ={10,30,54,23,96};
        int min =numbers[1];
        int max = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}




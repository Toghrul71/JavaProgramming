package December12Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Printing01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] arr = new String[5];


        for (int i=0;i<5;i++){

            arr[i] = input.nextLine();

           }
        for (String eachWord : arr) {

            System.out.println(eachWord.substring(0,3));
        }


    }
}

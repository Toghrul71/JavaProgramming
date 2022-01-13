package December12Replit;

import day11.SalaryCalculator;

import java.util.Scanner;

public class Printing02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        for (int j = 0; j < arr.length-1; j++) {
            System.out.println(arr[j]+", "+arr[j+1]);
            j++;
        }

    }
}

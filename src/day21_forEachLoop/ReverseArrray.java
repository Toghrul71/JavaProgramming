package day21_forEachLoop;

import java.util.Arrays;

public class ReverseArrray {
    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50};
                    //   0  1  2  3  4

        int reversed[]=new int[numbers.length];  // Array size is fixed and should be same as int[] numbers size

        reversed[0] = numbers[numbers.length-1];
        /*    // j       // i-increasing
        reversed[0]=numbers[3];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];
        */

        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) {

            System.out.println(numbers[i]+"");

        }


    }
}

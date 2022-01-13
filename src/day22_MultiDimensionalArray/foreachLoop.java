package day22_MultiDimensionalArray;

import java.util.Arrays;

public class foreachLoop {

    public static void main(String[] args) {
                //        0  1  2    0  1  2  3    0  1  2    3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        // single arrays    0            1                2

        for (int[] each1DArray : arr2D) {  // outer loop reads each 1D array

            for ( int eachElement : each1DArray){   // inner loop reads elements of each 1D Array
                System.out.print(eachElement+" ");
            }
            System.out.println();
        }

    }
}
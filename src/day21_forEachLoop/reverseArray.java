package day21_forEachLoop;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};
                    //   0  1  2

        int[] reversed =new int[numbers.length];

        // reversed[0] = numbers[2]

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j]=numbers[i]; //  0 == numbers.length-1
        }
        System.out.println(Arrays.toString(reversed));

    }
}

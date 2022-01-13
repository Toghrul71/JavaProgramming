package day21_forEachLoop;

import java.util.Arrays;

public class sortArrayDescending {
    public static void main(String[] args) {

        int[] array = {1,5,3};


         Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.println(array[i]);
        }

    }
}

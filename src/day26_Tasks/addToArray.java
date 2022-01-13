package day26_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class addToArray {
    public static void main(String[] args) {
        add_to_r(new int[]{1,2,3},5);
    }

    public static void add_to_r(int[] r, int n) {

        int[] newArray = new int[r.length + 1];

        int index = 0;

        for (int i = 0; i < r.length; i++) {
            newArray[index++] = r[i];
        }
        newArray[index] = n;

        System.out.println(Arrays.toString(newArray));


    }


}

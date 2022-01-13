package December18_Replits;

import java.util.Arrays;
import java.util.Scanner;

public class MethodOver1 {
    public static void main(String[] args) {
        int[] r1 = {9, 2, 3, 4};
        //double maxx = findMax(new double[]{r1};
        //Arrays.sort(r1);
        int max = findMax(r1);
        System.out.println(max);
    }

    public static int findMax(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;

    }

    public static double findMax(double[] array1) {
        Arrays.sort(array1);
        double max = array1[array1.length - 1];

        return max;
    }

}








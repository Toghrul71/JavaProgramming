package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = replace(arr, 2, 30);
        System.out.println(Arrays.toString(newArr));

        System.out.println("--------------------------------");

        String[] arrayy={"Java", "Python", "C++", "Ruby"};
        String[] newwArr = replace(arrayy,2, "C#");
        System.out.println(Arrays.toString(newwArr));

    }

    //                                       index no.
    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) { // since index number starts with 0
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;


    }

    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) { // since index number starts with 0
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;

    }

    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) { // since index number starts with 0
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;
    }
}
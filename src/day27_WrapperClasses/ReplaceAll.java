package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        double[] array = {1, 2, 3.3, 4};
        double[] newArray = replaceAll(array, 3, 30);
        System.out.println(Arrays.toString(newArray));
    }

    // replaces all matching old Element with new Element
    public static int[] replaceAll(int[] array, int oldEelement, int newElement) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldEelement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldEelement, double newElement) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldEelement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldEelement, char newElement) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldEelement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldEelement, String newElement) {


        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldEelement)) {
                array[i] = newElement;
            }
        }
        return array;
    }
}
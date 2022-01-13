package day25_HomeWork;

import java.util.Arrays;

public class Utilities {


    public static void merge(int[] array1, int[] array2) {


        int[] newArray = new int[array1.length + array2.length];
        int index = 0;// starts adding index 0, index 1...

        for (int i = 0; i < array1.length; i++) {
            newArray[index] = array1[i];
            index++; // starts adding index 0, index 1...
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[index] = array2[j];
            index++;// starts adding index 0, index 1...
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("---------------------------");


    }

    public static void merge(double[] array1, double[] array2) {


        double[] newArray = new double[array1.length + array2.length];
        int index = 0;// starts adding index 0, index 1...

        for (int i = 0; i < array1.length; i++) {
            newArray[index] = array1[i];
            index++; // starts adding index 0, index 1...
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[index] = array2[j];
            index++;// starts adding index 0, index 1...
        }
        System.out.println(Arrays.toString(newArray));

    }

    public static void merge(char[] array1, char[] array2) {


        char[] newArray = new char[array1.length + array2.length];
        int index = 0;// starts adding index 0, index 1...

        for (char i = 0; i < array1.length; i++) {
            newArray[index] = array1[i];
            index++; // starts adding index 0, index 1...
        }
        for (char j = 0; j < array2.length; j++) {
            newArray[index] = array2[j];
            index++;// starts adding index 0, index 1...
        }
        System.out.println(Arrays.toString(newArray));

    }

    public static void merge(String[] array1, String[] array2) {


        String[] newArray = new String[array1.length + array2.length];
        int index = 0;// starts adding index 0, index 1...

        for (int i = 0; i < array1.length; i++) {
            newArray[index] = array1[i];
            index++; // starts adding index 0, index 1...
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[index] = array2[j];
            index++;// starts adding index 0, index 1...
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static int maximum(int[] array) {

        int max = 0;

        for (int each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static double maximum(double[] array) {

        double max = 0;

        for (double each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;

    }

    public static long maximum(long[] array) {

        long max = 0;

        for (long each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;

    }

    public static short maximum(short[] array) {

        short max = 0;

        for (short each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;

    }

    public static float maximum(float[] array) {

        float max = 0;

        for (float each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static byte maximum(byte[] array) {

        byte max = 0;

        for (byte each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static int minimum(int[] array) {

        int min = 1;

        for (int each : array) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static double minimum(double[] array) {

        double min = 1;

        for (double each : array) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static int[] reverse(int[] array){
        int[] reverse= new int[array.length];
        int index=0;

        for (int i = array.length-1; i >=0 ; i--) {
        reverse[index]=array[i];
        index++;
        }
        return reverse;
    }

    public static String[] reverse(String[] array){
        String[] reverse=new String[array.length];
        int index=0;

        for (int i = array.length-1; i >=0 ; i--) {

            reverse[index]=array[i];// assigning indexes of array to new reverse array index 0, index 1,...
            index++;
        }
        return reverse;
    }

}
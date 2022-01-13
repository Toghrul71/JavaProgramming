package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // print each integer of integer array int separate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // this method prints each decimal number of double array in separate lines
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char of charArray in separate lines
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    // prints each String of StringArray in separate lines
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the maximum number for integer array
    public static int maximumNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1]; // last index of array is maximum
    }

    // returns the maximum number for double array
    public static double maximumNumber(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1]; // last index of array is maximum
    }

    // returns the minimum number for double array
    public static int minimumNumber(int[] array) {
        Arrays.sort(array);
        return array[0]; // last index of array is maximum
    }

    public static double minimumNumber(double[] array) {
        Arrays.sort(array);
        return array[0]; // last index of array is maximum
    }

    // check if integer is contained in the given array, returns booloean (contains(int[], int)
    public static boolean contains(int[] array, int number) {

        boolean result = false;

        for (int each : array) {
            if (each == number) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean contains(double[] array, double number) {

        boolean result = false;

        for (double each : array) {
            if (each == number) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String str) {

        boolean result = false;

        for (String each : array) {
            if (each.equalsIgnoreCase(str)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char ch) {

        boolean result = false;

        for (int each : array) {
            if (each == ch) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    // merge two arrays and returns new array
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

    public static int[] addElement(int[] array1, int number) {
        int[] newArray = new int[array1.length + 1];  // new array should have the size of array1 and size of number(size is 1)
        int i = 0;  // index number starts with zero
        for (int each : array1) {// to get all elements of array1
            newArray[i] = each;//  starts with 0 next is 1 (i is indexes)
            i++;
        }
        newArray[i] = number;  // the las index will be assigned to number
        return newArray;


    }

    public static String[] addElement(String[] array1, String number) {
        String[] newArray = new String[array1.length + 1];  // new array should have the size of array1 and size of number(size is 1)
        int i = 0;  // index number starts with zero
        for (String each : array1) {// to get all elements of array1
            newArray[i] = each;//  starts with 0 next is 1 (i is indexes)
            i++;
        }
        newArray[i] = number;  // the las index will be assigned to number
        return newArray;
    }


        public static int[] removeDuplicates(int[] array) {
        int[] result = {};


        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;
    }

    public static String[] removeDuplicates(String[] array)  {
        String[] result = {};


        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);               // ArraysUtility.addElement(result, each);

            }

        }
        return result;
    }
}
package day25_CustomMethods;

import java.util.Arrays;

public class addElements {
    public static void main(String[] args) {


       int[] newwArray = addElement(new int[]{1,2,3,4},5);
        System.out.println(Arrays.toString(newwArray));

        int[] newwArray2=addArrays(new int[]{1,2,3},new int[]{4,5,6});
        System.out.println(Arrays.toString(newwArray2));

    }
    public static int[] addElement(int[] array1, int number){
            int[] newArray= new int[array1.length+1];  // new array should have the size of array1 and size of number(size is 1)
            int i=0;  // index number starts with zero
        for (int each: array1){// to get all elements of array1
            newArray[i]=each;//  starts with 0 next is 1 (i is indexes)
            i++;
        }
             newArray[i]=number;  // the las index will be assigned to number
        return newArray;

    }

    public static int[] addArrays(int[] array1, int[] array2){ // class name

        int[] newArray= new int[array1.length+array2.length]; // we need new array with
        // the size of 2 arrays(array1 and array2)

        int index =0;  // index number of array should start with 0 for assigning purposes

        for (int i = 0; i < array1.length; i++) {
            newArray[index]=array1[i];// first array (array1 is assigned to newarray)
            index++;  // starts with adding index 0 of array1 and index 1 of array1....
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[index]=array2[j];// second array (array2 is assigned to newarray)
            index++; // starts with adding index 0 of array2 and index 1 of array2...
        }
        return newArray;
    }
}

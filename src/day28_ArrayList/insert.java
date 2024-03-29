package day28_ArrayList;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] newArray = insert(arr,2, 100);
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] insert (int[] array, int index, int element){
        int[] result = new int[array.length+1];
        int ind=0;

        for (int each:array){
            result[ind]=each;
            if(ind==index){
                result[ind]=element;
                result[++ind]=each;

            }
            ind++;
        }
        return result;
    }
}
/*
Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
        the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
 */

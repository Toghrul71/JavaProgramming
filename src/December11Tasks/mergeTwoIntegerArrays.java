package December11Tasks;

import java.util.Arrays;

public class mergeTwoIntegerArrays {
    public static void main(String[] args) {
        int[] array1 ={1,2,3};
        int[] array2={3,4,5};
        int[] merge=merge(array1, array2);
        System.out.println(Arrays.toString(merge));

    }

    public static int[] merge(int[] array1, int[] array2){

        int[] newArray = new int[array1.length+array2.length];
        int count =0;

        for (int i = 0; i < array1.length; i++) {

            newArray[count++] = array1[i];

        }
            for (int j = 0; j < array2.length; j++) {

            newArray[count++]=array2[j];


            }

            return newArray;
    }
}

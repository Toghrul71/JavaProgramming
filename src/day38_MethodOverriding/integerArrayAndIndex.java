package day38_MethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class integerArrayAndIndex {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        int[] newA=moveArrayAtIndex(array,2);
        System.out.println(Arrays.toString(newA));
    }


    public static int[] moveArrayAtIndex(int[] arr, int index){
        int[] newArray=new int[arr.length-1];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
            newArray[ind++]=arr[i];
        }
        }
        return newArray;
    }
}

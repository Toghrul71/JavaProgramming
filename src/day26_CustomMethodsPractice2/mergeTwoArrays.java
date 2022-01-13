package day26_CustomMethodsPractice2;

import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoArrays {


    public static int[] merge(int[] arr1, int[] arr2){  // [1,2,3] [4,5,6]


        int[] result= new int[arr1.length+ arr2.length]; // new array with enough size of 1st and 2nd arrays

        int index =0;

        for (int each:arr1){
            result[index++]=each;// first assgign index 0 of arr1 to index 0 of result array then continue
        }
        for (int each:arr2){
            result[index++]=each;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}

package December12Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        Arrays.sort(nums);
        int count=0;
        boolean hasFive=false;

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]==5 && nums[i+1]==5){

                hasFive=true;
        }

        }
        System.out.println(hasFive);
    }
}

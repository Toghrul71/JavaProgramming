package December22Replit;

import java.util.Arrays;

public class wednesdaySession {
    public static void main(String[] args) {

        int[] nums = new int[5];  // 8, 5, 5, -4, -3
        int a =5;

        nums[2]=a--; // 5
        nums[0]=a*2; // a is now 5-1; 4*2
        nums[4]=--a+(a-9); //a is 3 3+3-9=-3.
        nums[1]=nums[2]; // 5
        nums[3]=nums[a-3]; // a is 3 and 3-3=0

        System.out.println(Arrays.toString(nums));
         // -5




    }
}

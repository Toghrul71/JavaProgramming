package December12Replit;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];

        for (int eachNumber : nums) {

            if(eachNumber>max){
                max=eachNumber;
            }

        }
        System.out.println(max);
    }
}

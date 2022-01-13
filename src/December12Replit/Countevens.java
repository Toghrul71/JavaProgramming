package December12Replit;

import java.util.Scanner;

public class Countevens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                countEven++;
        }

        }
        System.out.println(countEven);


        input.close();


    }
}

package day20_Arrays;

import java.util.Arrays;

public class ArrayPracticeDecember4 {
    public static void main(String[] args) {
       // Create a variable named numbers that can have 5 integers
        //int numbers = 10;   it can only store 1 number: not more than one: 10, 20 , 30;
         int[] numbers = new int[5];  // it can store 5 integers: indexes: 0 1 2 3 4 (5 indexes)

         numbers[0]=10;  // index 0 is 10 now
         numbers[1]=20; //  index 0 is 20 now
         numbers[2]=30; //  index 0 is 30 now
         numbers[3]=40; //  index 0 is 40 now
         numbers[4]=50; //  index 0 is 50 now

        System.out.println(Arrays.toString(numbers)); // it needs to be converted to String
        System.out.println(numbers.length);

        System.out.println("-------------------------");

        // Create a variable named colors that has: Yellow, Red, White, Blue, Green, Black. (String data type)

        String[] colors = {"Yello", "Red", "Black", "White", "Blue", "Green"};

        System.out.println(Arrays.toString(colors));
        System.out.println(colors.length);


    }
}

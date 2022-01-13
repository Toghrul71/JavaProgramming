package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largestNumberInArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int n = 2; // it should give us 3rd max and remove first and second

        //array.removeIf(p-> Collections.max(array)==p);

        for (int i = 1; i < n; i++) {  // removes max elements starting from first max: (8), then second max: (7),
            // then third max stays because for loop condition says <3
            array.removeIf(p -> Collections.max(array) == p); // removes 1st and 2nd.
            // Then checks 3rd(3rd stays because 3 is not less than 3// the condition is not true
        }
        int max=Collections.max(array);
        //int maxx = Collections.max(array);

        System.out.println(max);
    }
}

// write a program that can return the nth largest number from an arraylist

    // {1,2,3,4,5,6,7,8}
//      n=3  3rd largest number
    //ouput=6
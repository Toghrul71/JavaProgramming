package day21_forEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]+" "); // numbers[i] is an element that is contained in array.
            //                                            [i]  represents each index number
        }

        System.out.println("--------------------");

        int[] numbers2= {1,2,3,4,5};

        Arrays.sort(numbers2);

        System.out.println(Arrays.toString(numbers2));

        System.out.println("Minimum number "+ numbers2[0]);
        System.out.println("Maximum number "+ numbers2[numbers2.length-1]);

        System.out.println("-------------------------------------------------");

        String[] names = {"Toghrul, Zeynab, Vahida"};

        Arrays.sort(names);  // sorts in ascending +++123456 order

        System.out.println(Arrays.toString(names));

        String[] words= {"Anna", "ANNA"};  // it sorts as per to ASCII table
        // N- number comes before n-number() in ASCII table
        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

    }
}

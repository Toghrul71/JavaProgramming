package day21_forEachLoop;

import java.util.Arrays;

public class equalsMethodArray {
    public static void main(String[] args) {

        int[] array1= {1,3,2};
        int[] array2= {1,2,3};

        Arrays.sort(array1); // sorts in ascending order
        Arrays.sort(array2);// sorts in ascending order

        boolean r1=Arrays.equals(array1,array2);

        System.out.println(r1);

        System.out.println("--------------------------------");

        char[] ch1 ={'a','c','b'};
        char[] ch2 ={'a','b','c'};  // check if ch1 =ch2

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram= Arrays.equals(ch1,ch2);

        System.out.println("Is Anagram: "+ isAnagram);


    }
}

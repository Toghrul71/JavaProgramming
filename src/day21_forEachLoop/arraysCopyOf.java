package day21_forEachLoop;

import java.util.Arrays;

public class arraysCopyOf {
    public static void main(String[] args) {

        String[] students = {"Toghrul", "Zeynab","Vahida"};
        String[] earlyBirds= Arrays.copyOf(students,5);  // copies from 1st element(which is index 0


        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        numbers=Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));

        char[] ch1 ={'A','B','C','D', 'E', 'F', 'G'};
        char[] ch2=Arrays.copyOfRange(ch1,2,7);

        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------");

        int[] scores ={10,20,30,40,50,60,70,80,90,100};
                    //  0  1  2  3  4  5  6  7  8  9

        int[] result= Arrays.copyOfRange(scores,3,scores.length);

        System.out.println(Arrays.toString(result));


    }
}

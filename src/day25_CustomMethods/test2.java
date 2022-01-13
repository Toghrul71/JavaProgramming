package day25_CustomMethods;

import utilities.ArraysUtility;

import java.lang.reflect.Array;

public class test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        ArraysUtility.printEach(arr1);

        System.out.println("------------------------");

        double[] arr2={1.5,2.5};
        ArraysUtility.printEach(arr2);

        System.out.println("------------------------");

        char[] arr3={'A','B','C'};

        ArraysUtility.printEach(arr3);

        System.out.println("------------------------");

        String[] names={"Toghrul", "Vahida", "Zeynab"};
        ArraysUtility.printEach(names);

        System.out.println("--------------------------");
        // returns the maximum number for integer array

        int[] n1={10,2,3,4,5,6};

        int max1=ArraysUtility.maximumNumber(n1);
        System.out.println(max1);

        System.out.println("--------------------------");

        double[] n2={1.5,2.5,3.5};
        double max2 = ArraysUtility.maximumNumber(n2);
        double min2=ArraysUtility.minimumNumber(n2);
        System.out.println(max2);
        System.out.println(min2);

        System.out.println("------------------------------");

        int[] a1={1,2,3,4,5,6,7};
        boolean isContained = ArraysUtility.contains(a1,7);
        System.out.println(isContained);




    }
}

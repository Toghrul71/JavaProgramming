package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
                String[] group1 = {"John", "Jo", "James"};
                String[] group2 = {"Pam", "Bo", "Jay"};
                String[] group3 = {"Neil", "Mo", "Si"};

            String[][] groups = new String[3][];   // size here represents number of arrays: indexes: 0, 1 , 2
            groups[0]=group1;
            groups[1]=group2;
            groups[2]=group3;

            // Arrays.toString is for single dimensional array only
            //rule for printing multi dimensional array: Arrays.deepToString- method

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------------------");

        // index number: 0 1 2   0 1 2 3   0 1  2 3  4
        int[][] arr2D={ {1,2,3},{4,5,6,7},{8,9,10,11,12} };
        // index number:   0        1           2

        //int new1 = int[1][1]


        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1])); // [1] reperesents index number of array

        System.out.println(arr2D[1][3]);// [1] reperesents index number of array [3] represents index number of element

    }
}

/*
String[] group1 = {"John", "Jo", "James"}
String[] group2 = {"Pam", "Bo", "Jay"}
String[] group3 = {"Neil", "Mo", "Si"}

 */
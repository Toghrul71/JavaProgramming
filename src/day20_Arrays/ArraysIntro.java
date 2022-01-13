package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable thats capable enough to contain 5 names


        String[] myGroup = new String[5];  // it can store up to 5 names 0  1  2  3  4
          myGroup[0]="Zeynab";            //System.out.println(myGroup);   // hashcode
          myGroup[1]="Toghrul";          // class name: Arrays
                                        // package: java.util

        System.out.println(Arrays.toString(myGroup)); //

        System.out.println("-------------------------------------------");

        String[] days= {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            // index       0          1           2            3          4         5           6
        System.out.println(Arrays.toString(days));

        int number =5;

        if(number <1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

        System.out.println("--------------------------");





    }
}

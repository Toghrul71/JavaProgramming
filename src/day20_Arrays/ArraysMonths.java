package day20_Arrays;

import java.util.Arrays;

public class ArraysMonths {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        /*
        System.out.println(months[0]);
        System.out.println(months[1]);
        */

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i]+" ");

        }
        System.out.println("--------------------------");

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.print(months[i]+" ");
        }
    }

}

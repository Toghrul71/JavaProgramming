package day20_Arrays;

import java.util.Arrays;

public class OneHundredTo1 {
    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = number.length; i >=1 ; i--) {

            number[number.length-i]=i;
        }
        System.out.println(Arrays.toString(number));
    }
}

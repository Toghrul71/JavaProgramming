package day21_forEachLoop;

import java.util.Arrays;

public class zerosToEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] zerosToEnd=new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                zerosToEnd[count]=array[i];
                count++;
            }

        }
        System.out.println(Arrays.toString(zerosToEnd));

    }
}

/*
int[] moveZeros = new int[numbers.length];
        int count =0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] !=0){
                moveZeros[count]=numbers[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(moveZeros));
 */
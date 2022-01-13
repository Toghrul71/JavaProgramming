package day20_Arrays;

import java.util.Arrays;

public class allZeros {
    public static void main(String[] args) {
        int[] numbers ={10,0,5,1,0,1};

        int[] moveZeros = new int[numbers.length];
        int count =0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] !=0){
                moveZeros[count]=numbers[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(moveZeros));
    }
}

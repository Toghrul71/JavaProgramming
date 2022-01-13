package December11Tasks;

import java.util.Arrays;

public class reverseIntegerParameter {
    public static void main(String[] args) {
        int[] reversedd= reverse(new int[]{1,3,5,7});
        System.out.println(Arrays.toString(reversedd));

    }

    public static int[] reverse(int [] array){
        int[] reversed= new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {

            reversed[j]=array[i];
        }
        return reversed;
    }
}

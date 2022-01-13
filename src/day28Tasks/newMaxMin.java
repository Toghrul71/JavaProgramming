package day28Tasks;
import java.util.*;
public class newMaxMin {
    public static int findMax(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;

    }

    public static double findMax(double[] array) {
        Arrays.sort(array);
        double max = array[array.length - 1];

        return max;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if (runInt) {  // if true
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {  // if false
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        }
    }
}
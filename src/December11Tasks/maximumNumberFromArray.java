package December11Tasks;

public class maximumNumberFromArray {

    public static void main(String[] args) {
        int maximum = maxNumber(new int [] {11,24,12,22});

        System.out.println(maximum);

        int multiplyByTwo=maximum*2;
        System.out.println(multiplyByTwo);

        int minimum = minNumber(new int[]{1,2,3,4});
        System.out.println(minimum);

    }

    public static int maxNumber(int[] arr){
        int max = arr[0];

        for (int each : arr) {
            if(each>max){
                max=each;
            }
        }
        return max;

    }

    public static int minNumber(int[] arr){
        int min=arr[0];

        for (int each : arr) {
            if(each<min){
                min=each;
            }
        }
            return min;
    }
}

package day21_forEachLoop;

public class evenAndOddArray {
    public static void main(String[] args) {

        int[] numbers ={3,4,5,6,7};

        int countOdd=0;
        int countEven=0;

        for (int eachNumber : numbers) {
            if(eachNumber%2==0){
                countEven++;
            }if (eachNumber%2!=0){
                countOdd++;
            }
        }
        System.out.println("Even numbers count: "+countEven);
        System.out.println("Odd numbers count: "+countOdd);

    }
}

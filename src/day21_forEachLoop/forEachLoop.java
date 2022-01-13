package day21_forEachLoop;

public class forEachLoop {
    public static void main(String[] args) {

        int[] numbers = {3,6,9,9,6,5,4,7,8,10};  // integer elements
                    //   0 1 2 3 4 5 6 7 8  9

        for (int i = 0; i < numbers.length; i++) { // i represents indexes of array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("---------------------------");

        for(int eachElement : numbers ){ // assigns each element to variable
            System.out.println(eachElement);

        }

    }
}

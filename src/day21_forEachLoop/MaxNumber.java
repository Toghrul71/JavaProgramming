package day21_forEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0]; // assume that maximum number is 10 and if there is another number >10 then that is max number

        for (int eachElement : numbers) {
            if(eachElement>max){
                max=eachElement;
            }

        }
        System.out.println(max);
    }
}

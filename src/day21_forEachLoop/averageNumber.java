package day21_forEachLoop;

public class averageNumber {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        double sum=0;

        for (int eachElement : numbers) {
            sum+=eachElement;  // adds each element  0 + 10 + 20 + 30 +40 +50 +60
        }
        double average = sum/numbers.length;

        System.out.println(average);
    }
}

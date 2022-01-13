package day25_CustomMethods;

import java.util.Arrays;

public class methodOverLoading {
    public static void main(String[] args) {


        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(intArray);

        double[] doublearray = {1.5, 2.5, 3.5};
        Arrays.sort(doublearray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("--------------------------------");

        double sum1 = sumOfNumbers(10,20);
        System.out.println(sum1);
        // sum of 10 and 20

        int sum2= sumOfNumbers(10,20,30);
        System.out.println(sum2);
        // sum of 10 and 20 and 30

        int sum3=sumOfNumbers(10,20,30,40);
        System.out.println(sum3);
        // sum of 10 and 20 and 30 and 40
    }
    public static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }
    public static int sumOfNumbers(int num1,int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1,int num2, int num3, int num4){  //  should be different
        return sumOfNumbers(num1,num2,num3)+num4;

    }public static double sumOfNumbers(double num1,double num2, double num3,double num4){ // should be different
        return num1+num2;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }

}

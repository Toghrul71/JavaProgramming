package day25_CustomMethods;
import day25_HomeWork.Utilities;
import day26_CustomMethodsPractice2.RemoveElements2;
import utilities.ArraysUtility;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {

        int[] array1={1,2,5,4};
        int[] array2={4,5,6,7};

        Utilities.merge(array1,array2);

        System.out.println("------------");

        double[] array3={1.5,2,5,4};
        double[] array4={4,5.5,6,7};

        Utilities.merge(array3,array4);

        System.out.println("------------");

        char[] array5={'A','B'};
        char[] array6={'c','d'};

        Utilities.merge(array5,array6);

        System.out.println("------------");

        String[] array7={"good","is"};
        String[] array8={"java"};

        Utilities.merge(array7,array8);

        System.out.println("------------");

        int[] array={1,2,3,4,5};
        int max = Utilities.maximum(array);
        System.out.println("Maximum number is: "+max);

        System.out.println("------------");
        long[] arrayy={1,2,3,4,5,6};
        long maxx = Utilities.maximum(arrayy);
        System.out.println(maxx);

        System.out.println("------------");
        int[] arrayyyy={4,2,3,1,5};
        int minimum = Utilities.minimum(arrayyyy);
        System.out.println(minimum);

        System.out.println("------------");
        double[] arrayyyyy={4.0,2,3,1,5};
        double minimum2 = Utilities.minimum(arrayyyy);
        System.out.println(minimum2);

        System.out.println("------------");
        int[] arrayyyyyy={2,3,1,5};
        int[] reverse = Utilities.reverse(arrayyyyyy);
        System.out.println(Arrays.toString(reverse));

        System.out.println("------------");
        String[] arrayyyyuyy={"java","is", "good"};
        String[] reversedd= Utilities.reverse(arrayyyyuyy);
        System.out.println(Arrays.toString(reversedd));

        int[] array123={1,2,3};
        int[] newwarrayy= RemoveElements2.removeElement(array123,2);
        System.out.println(Arrays.toString(newwarrayy));
    }





}

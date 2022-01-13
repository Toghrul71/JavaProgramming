package day27_WrapperClasses;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] array= {1,1,2,2,3,3};
        int[] newwArray = removeDuplicates(array);
        System.out.println(Arrays.toString(newwArray));

        System.out.println("-----------------------------");

        String[] words={"Java", "Java", "Python"};

        //words= Arrays.stream(words).distinct().toArray();

    }
    //                                  {1,1,2,2,3,3}
    public static int[] removeDuplicates(int[] array){
        int[] result= {};
        int index=0;

        for (int each:array){
            if(!ArraysUtility.contains(result,each)){
            result=ArraysUtility.addElement(result,each);
            index++;
            }

        }
        return result;
    }
}

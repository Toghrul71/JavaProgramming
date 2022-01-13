package day25_CustomMethods;

import java.util.Arrays;

public class addStringArray {
    public static void main(String[] args) {

        String[] newwArray = names(new String[]{"james","good"}, new String("good"));
        System.out.println(Arrays.toString(newwArray));

    }
    public static String[] names(String[] array, String name){
        String[] newArray= new String[array.length+1];
        int index=0;

        for (int i = 0; i < array.length; i++) {
            newArray[index]=array[i];
            index++;
        }
        newArray[index]=name;
        return newArray;

    }
}

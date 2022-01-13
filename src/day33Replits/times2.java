package day33Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class times2 {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> newNums=new ArrayList<>();

        for (Integer eachNumber:nums){
            newNums.add(eachNumber*2);
        }
        return newNums;
    }

    public static void main(String[] args) {

    }
}

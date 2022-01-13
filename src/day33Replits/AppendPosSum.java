package day33Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AppendPosSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));


    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> array){
        ArrayList<Integer> newArray=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i)>0){
                newArray.add(array.get(i));
                sum+=array.get(i);
            }
        }

        newArray.add(newArray.size(),sum);
        return newArray;
    }
}

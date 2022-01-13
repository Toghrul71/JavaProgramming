package day33Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class combineAll {
    public static ArrayList<Integer> combineAl(ArrayList<Integer> numbersOne,ArrayList<Integer> numbersTwo ){
        ArrayList<Integer> combinedArray=new ArrayList<>();

        for (Integer each1:numbersOne){
            combinedArray.add(each1);
        }
        for (Integer each2:numbersTwo){
            combinedArray.add(each2);
        }
        return combinedArray;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAl(list, list2));

    }

}

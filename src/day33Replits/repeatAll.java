package day33Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class repeatAll {
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> arrayList){
        ArrayList<Boolean> newArrayList=new ArrayList<Boolean>();

        for (int i = 0; i < 2; i++) {
            newArrayList.addAll(arrayList);
        }
        return newArrayList;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }
}

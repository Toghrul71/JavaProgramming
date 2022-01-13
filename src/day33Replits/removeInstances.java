package day33Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class removeInstances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer number){
        ArrayList<Integer> newR=new ArrayList<Integer>();
        for (Integer each:r){
            if(each!=number){
               newR.add(each);
            }
        }
        return newR;
    }
}

package day33Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {


    }
    public static ArrayList<String> combineRs(String[] r1, String[] r2){

        ArrayList<String> combined=new ArrayList<>();

        for (String each1:r1){
            combined.add(each1);
        }
        for (String each2:r2){
            combined.add(each2);
        }
        return combined;
    }
}

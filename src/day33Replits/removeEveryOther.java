package day33Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class removeEveryOther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));
    }
    public static ArrayList<String> removeEveryOther(ArrayList<String> words){
        ArrayList<String> newWords=new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if(i%2!=0){
                newWords.add(words.get(i));
            }


       }
        return newWords;
    }
}

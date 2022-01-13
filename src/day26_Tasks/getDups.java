package day26_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class getDups {
    public static void main(String[] args) {
        int newww= getDup(new String[]{"1","1","1","2"});
        System.out.println(newww);

    }

    public static int getDup(String[] r) {


        int countDups=0;

        for (int i = 0; i < r.length; i++) {
            int count =0;

            for (int j = 0; j < r.length; j++) {
                if(r[i].equals(r[j])){
                    count++;
                }
            }
            if(count>=2){
                countDups++;
            }
        }

        return countDups;
    }

}
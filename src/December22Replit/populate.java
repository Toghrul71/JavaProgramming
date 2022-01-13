package December22Replit;

import java.util.Arrays;
import java.util.Scanner;

public class populate {
    public static void main(String[] args) {


            int[] neww =populate(new int[5]);
        System.out.println(Arrays.toString(neww));
        }


    public static int[] populate(int[] r){
        int num=1;
        int index=0;

        for (int i = 0; i < r.length; i++) {
            r[index++]=num++;   //  0 -1    1-2   2-3   3-4  4-5

        }


        return r;
    }
}

package December22Replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class doSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));

    }
    public static int[] do_switch(int[] i) {

        int temp= i[0];  // keep number[0] and not lose it;
        //
        i[0]= i[i.length-1];  // once I keep number[0] in temp, I can now assign number[0] to different index
       i[i.length-1]=temp;

        return i;

        //ArrayList<Integer> arrayy=new ArrayList<>(Arrays.asList(numbers)); // convert array to arrayList

        //Collections.swap(arrayy,0,arrayy.size()-1);



    }
}

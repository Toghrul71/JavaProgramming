package December19Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class at3rdChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }

    public static String at3(String target,String word){
        String target1= target.substring(0,3);
        String target2=target.substring(3);
        String newe= target1+word+target2;

        return newe.substring(0, newe.length());

    }
}

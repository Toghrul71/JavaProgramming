package day28Tasks;

import java.util.Scanner;

public class hamletQuote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }


    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        return toBe || notToBe;


    }


}


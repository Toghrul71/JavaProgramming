package day26_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        String result="";

        String[] newStr= str.split(",");

        int min = newStr[0].length();

        for (int i = 0; i < newStr.length; i++) {
        if(newStr[i].length()<min){
            min=newStr[i].length();

        }
        }

       for (String each:newStr){
           if(each.length()==min){
               result+=each+",";
           }
       }
        String[] newStr2= result.split(",");
        Arrays.sort(newStr2);

        System.out.println(Arrays.toString(newStr2));
    }
}

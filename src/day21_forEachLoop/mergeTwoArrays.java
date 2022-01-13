package day21_forEachLoop;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Aysenur"};  // 2 elements
        String[] group2 = {"Ayse", "Suat"}; // 2 elements

        String[] students= new String[group1.length+group2.length];  // 2+2 =4 elements

        int i =0;  // declare index number 0
        for (String each : group1) {  // "Ali", "Aysenur"
            students[i++]=each;  // each element is assigned to students first Ali is assigned to 0, then Aysenur assigned to 1
        }
        for (String each : group2) {  // "Ayse", "Suat"
         students[i++]=each;// each element assigned to index: Ayse assigned to 0, Suat assigned to 1
        }
        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------");

        char[] ch1={'A','B','C'};
        char[]ch2={'D','E','F','G','H'};

        char[] chars= new char[ch1.length+ch2.length];

        int j=0;

        for (char ch : ch1) {
            chars[j++]=ch; // each element assigned to indexes of chars variable:

        }
        for (char ch : ch2) {
            chars[j++]=ch; // each element assigned to indexes of chars variable:

        }
        System.out.println(Arrays.toString(chars));
    }
}

package day20_Arrays;

import java.util.Arrays;

public class ArrayChar {
    public static void main(String[] args) {
        char [] letters = new char[26];
        //letters[0]='A';
        //letters[1]='B';
        char ch ='A';
        for (int i = 0; i < letters.length; i++) {  //// i: index numbers 0 - last index
            letters[i]=ch++;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("--------------------------------------");
        char[]letter =new char[26];

        for (int i = 0, j ='Z'; i <letter.length&& j>='A' ; i++,j--) {
            letter[i]= (char) j;
        }
        System.out.println(Arrays.toString(letter));
        System.out.println("---------------------------");


        }


    }


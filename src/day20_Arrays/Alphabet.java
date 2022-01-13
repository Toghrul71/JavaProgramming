package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        //
        char [] alphabet = new char[26];  //  Z--A
        //alphabet[0]='Z';  // 90
        //alphabet[1]='Y'; // 89

        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i]=ch;
        }
        System.out.println(Arrays.toString(alphabet));  // converts to String
        //System.out.println(alphabet[1]);

        System.out.println("--------------------------");

        char[] alphabets= new char[26];
        for(char i =0, j='Z'; i<alphabets.length; i++, j--){
            alphabets[i]=j;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}

package December22Replit;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
    public static boolean isAnagram(String word1, String word2){
        char[] ch1=word1.toLowerCase().toCharArray();
        char[] ch2=word2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}

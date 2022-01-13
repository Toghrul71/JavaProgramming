package December22Replit;

import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));

    }
    public static int wordCount(String words){

        String[] array =words.split(" ");

        int count=0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }
}

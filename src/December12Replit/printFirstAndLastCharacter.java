package December12Replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class printFirstAndLastCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] words2= new String[words.length];

        for (int i = 0; i < words.length; i++) {
            words2[i]=""+words[i].charAt(0)+(words[i].substring(words[i].length()-1));
        }
        System.out.println(Arrays.toString(words2));
        }

    }


package December12Replit;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");
        String reversed = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed+=" "+arr[i];
        }
        System.out.println(reversed);
            }

        }


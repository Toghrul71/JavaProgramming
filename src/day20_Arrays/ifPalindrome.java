package day20_Arrays;

public class ifPalindrome {
    public static void main(String[] args) {

        String word = "Java";
        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            char ch = word.charAt(i);

            reverse+=""+ch;



        }

        if(reverse.equals(word)){
            System.out.println("Is palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}

package day21_forEachLoop;

public class countPalindromsInarray {
    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java"};
        int countPalindrome = 0;

        for (String outerEach : words) {

            for (int i = words.length - 1; i >= 0; i--) {

                if(outerEach.equals(words[i])){
                    countPalindrome++;
                }
            }



        }
        System.out.println(countPalindrome);
    }
}
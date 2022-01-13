package day25_CustomMethods;
import utilities.StringUtility;
public class test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);  // this method is void so its printing automatichally

        System.out.println();
        System.out.println("---------------------------------------");

        String reversed = StringUtility.reverse(str); //
        System.out.println(reversed);
        System.out.println("-----------------------------------------");
        String word = "civic";
        boolean isPalindrome = StringUtility.isPalindrome(word);
        System.out.println(word + " is palindrome: " + isPalindrome);

        System.out.println("----------------------------------------");

        String[] names = {"Toghrul", "Zeynab", "Vahida"};
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println("-----------------------------------------------");

        String s2="aaaaaaaaaaaaaaaaaab";

        String news2 = StringUtility.removeDuplicates(s2);
        System.out.println(news2);

    }
}

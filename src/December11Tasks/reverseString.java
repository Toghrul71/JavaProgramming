package December11Tasks;

public class reverseString<isPalindrome> {
    public void main(String[] args) {
        String reversedString = reversed("Java");

        System.out.println(reversedString);



    }

    public static String reversed(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += "" + str.charAt(i);

        }
        return reversedStr;
    }



    }


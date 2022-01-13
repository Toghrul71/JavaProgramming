package December11Tasks;

public class isPalindrome {
    public static void main(String[] args) {
        boolean checkIfPalindrome= isPalindrome("level");
        System.out.println(checkIfPalindrome);
    }
    public static boolean isPalindrome(String str){
        String reversed = "";
        boolean isPalindromeee=false;

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=""+str.charAt(i);

            if(reversed.equalsIgnoreCase(str)){
                isPalindromeee=true;
            }else {
                isPalindromeee=false;
            }


        }
        return isPalindromeee;
    }
}

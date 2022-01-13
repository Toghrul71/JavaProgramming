public class January8Tasks {
    public static void main(String[] args) {
        boolean isp=isPalindrome("levl");
        System.out.println(isp);

    }
    public static boolean isPalindrome(String word){
        String reversed="";
        boolean isPalindrome=false;

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);
            }
        if(reversed.equalsIgnoreCase(word)){
            return true;
        }else {
            return false;
        }
    }
}

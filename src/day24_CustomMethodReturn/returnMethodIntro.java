package day24_CustomMethodReturn;

public class returnMethodIntro {
    public static void main(String[] args) {
        String str = "JavaJ";

        String result = reverse(str);

        System.out.println(result);

        if(result.equals(str)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome");
        }
    }

    public static String reverse(String str){   // "Java"
        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) { // reverse

            reverse +=str.charAt(i);              // given string

        }
        return reverse;

    }
}

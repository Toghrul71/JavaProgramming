package December22Replit;

public class reverse {
    public static void main(String[] args) {

    }
    public static String reverse(String input){

        String result="";
        for (int i = input.length()-1; i >=0 ; i--) {

        result +=input.charAt(i);

        }
        return result;
    }
}

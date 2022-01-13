package Day29_ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {

        String removed =removeDuplicates("bcabc");
        System.out.println(removed);

    }

    public static String removeDuplicates(String input){

        String result="";

        for (int i = 0; i < input.length(); i++) {

                if (!result.contains(""+input.charAt(i))){
                    result+=input.charAt(i);


          }
        }
        return result ;
    }
}

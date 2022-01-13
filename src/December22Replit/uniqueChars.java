package December22Replit;

public class uniqueChars {
    public static void main(String[] args) {
        String neww=uniqueChars("spoon");
        System.out.println(neww);

    }

    public static String uniqueChars(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {

            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}

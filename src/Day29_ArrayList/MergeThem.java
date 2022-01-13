package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeThem {
    public static void main(String[] args) {
        String merged = mergeStrings("wooden","spoon");
        System.out.println(merged);
    }
    public static String mergeStrings(String one, String two){

        String result="";

        for (int i = 0; i < one.length() || i<two.length(); i++) {
            if(i<one.length()){  // i<6 , i<5
                result+=one.charAt(i);
            }
              if(i<two.length()){ // i<5,  i<4
                    result+=two.charAt(i);

            }
        }
        return result;
    }
}

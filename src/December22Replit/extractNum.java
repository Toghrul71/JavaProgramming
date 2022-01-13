package December22Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class extractNum {
    public static void main(String[] args) {
        String neww=extractNum("hgkjhk7");
        System.out.println(neww);

    }
    public static String extractNum(String s){
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
            result+=s.charAt(i);
            }
        }

        return result;

    }
}

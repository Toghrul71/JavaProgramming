package December19Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class cleanString {
    public static void main(String[] args) {
        String textt = clean("one two three", "two");
        System.out.println(textt);

    }

    public static String clean(String text, String badWord) {
        return text.replace(" "+badWord,"");
        }

    }

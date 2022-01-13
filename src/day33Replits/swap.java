package day33Replits;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2){
        Collections.swap(list,pos1,pos2);

        return list;
    }

}

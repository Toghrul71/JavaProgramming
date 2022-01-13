package Day29_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class convertArrayToList {
    public static void main(String[] args) {

        String countries="Japan, Azerbaijan, Canada";
        String[] array=countries.split("");

        ArrayList<String>list=new ArrayList<>(Arrays.asList(array));
        list.removeIf(p-> p.length()>=10);
        // specify the size 0 is because array list
        // is converted to array 0 will be the size of array

        System.out.println(list);

    }
}

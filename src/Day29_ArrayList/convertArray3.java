package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArray3 {
    public static void main(String[] args) {

        String names="mary monica good";  // regular string
        String[] arrayNames= names.split(" "); // convert string to array
        //String[] names={"mary", "monica", "good"};
        ArrayList<String> names1=new ArrayList<>(Arrays.asList(arrayNames)); // convert array to array list

        //ArrayList<String> names1=new ArrayList<>(Arrays.asList(names));

        names1.removeIf(p-> p.startsWith("g"));
        System.out.println(names1);
    }
}

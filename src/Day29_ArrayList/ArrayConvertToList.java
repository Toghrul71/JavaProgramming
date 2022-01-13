package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConvertToList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Toghrul", "Zeynab", "Vahida", "G"));
        names.retainAll(Arrays.asList("Toghrul", "Zeynab", "Vahida"));
        System.out.println(names);

    }
}

package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(10,2,5,4,7,8,90));

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));

        Collections.reverse(list);
        System.out.println(list);
        System.out.println("--------------");

        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Collections.swap(list1,2,3);
        System.out.println(list1);
    }
}

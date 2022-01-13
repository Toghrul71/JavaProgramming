package day28Tasks;

import java.util.ArrayList;

public class CombineTwoString {
    public static void main(String[] args) {


        String[] arr1 ={"A", "B", "C"};
        String[] arr2 ={"D", "E", "F"};
        ArrayList<String>list=new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);

        }
            for (int j = 0; j < arr2.length ; j++) {
                list.add(arr2[j]);
        }


        System.out.println(list);


        /*ArrayList<String> list=new ArrayList<>(); //{"A", "B", "C"};
        list.add("A");
        list.add("B");
        list.add("C");

        ArrayList<String>list1=new ArrayList<>();
        list1.add("D");
        list1.add("E");
        list1.add("F");
        list1.add("G");

        ArrayList<String> listCombined= new ArrayList<>();

        listCombined.addAll(list);
        listCombined.addAll(list1);

        System.out.println(listCombined);
*/
    }
}

package Day29_ArrayList;

import day28_ArrayList.ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArrayToArrayList {
    public static void main(String[] args) {

        String[] names={"Josh", "Jack", "Daniel", "Dan", "Bre"};
        /*
        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        */
        // if its non primtive type
        ArrayList<String>list=new ArrayList<>(Arrays.asList(names));
        list.add(0,"Good");
        System.out.println(list);
        System.out.println("--------------------------------------");

        // for primitive arrays
        Integer[] numbers = {1,2,3,4,5};  // cant be int can be Integer
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(list2);

        System.out.println("------------------------------------------------");

        int[] arr2={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer>list3= new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list3);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer>list=new ArrayList<>();

        for (int each:array){
            list.add(each);
        }
        return list;
    }
}

package day28_ArrayList;

import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each:list){
            if(!result.contains(each)){ // if result doesnt contain each then add each to result
                result.add(each);
            }
        }

        System.out.println(result);
        System.out.println("------------------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));  // equal means if list 1 and list 2 have same elements. cant use == here. Because list1 and list2 are not same they have different memory locations in hip
        // equals method compares each elements one by one
    }
}

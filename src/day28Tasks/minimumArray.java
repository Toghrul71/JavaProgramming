package day28Tasks;

import java.util.ArrayList;

public class minimumArray {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int min= list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println(min);
    }
}
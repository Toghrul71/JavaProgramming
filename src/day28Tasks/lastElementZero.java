package day28Tasks;

import java.util.ArrayList;

public class lastElementZero {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(list.size()-1,0);
        System.out.println(list);
    }
}

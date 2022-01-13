package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println(numbers.toString());
        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 0, 0));
        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize = list.size();
        int totalZeros = size - newSize;

        for (int i = 0; i < totalZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 5, 6, 0, 0));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
            System.out.println(result);
        }
    }
}

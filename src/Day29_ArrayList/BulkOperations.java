package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3));
        //list.removeAll(Arrays.asList(1,2));
        list.retainAll(Arrays.asList(2)); // keeps only 2 and removes the rest
        System.out.println(list);

        System.out.println("--------");

        ArrayList<String>jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("Qa", "SDET", "Scrummaster"));
        jobTitles.retainAll(Arrays.asList("Qa","SDET"));
        System.out.println(jobTitles);
        System.out.println("----------------");

        ArrayList<Integer>nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,2,5,4));

        boolean r1=nums.contains(10);
        boolean r2=nums.containsAll(Arrays.asList(1,2,3));

        System.out.println(r1);
        System.out.println(r2);
    }
}

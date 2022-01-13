package Day29_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class reverseArrayandArraylist {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int[] newArray=new int[array.length];
        int index=0;
        for (int i = array.length-1; i >=0 ; i--) {
            newArray[index++]=array[i];
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("---------------------------");

        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer>reversedList=new ArrayList<>();
        for (int i = list.size()-1 ; i >=0 ; i--) {
            int each=list.get(i);
            reversedList.add(each);

        }
        System.out.println(reversedList);
    }
}

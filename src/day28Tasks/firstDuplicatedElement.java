package day28Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class firstDuplicatedElement {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));



        int result=0;

        for (int i = 0; i < list.size(); i++) {
            if(list.indexOf(i)!=list.lastIndexOf(i)){
                result=list.get(i);
                break;
            }
        }


        System.out.println(result);




    }
}

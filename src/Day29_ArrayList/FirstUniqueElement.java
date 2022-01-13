package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));

        System.out.println(list);


        for (Integer outerEach:list){
            int count=0;

            for (Integer innerEach:list){
                if(outerEach==innerEach){
                    count++;
                }
            }
            if(count==1){
                System.out.println(outerEach);
                break;
            }
        }
    }
}

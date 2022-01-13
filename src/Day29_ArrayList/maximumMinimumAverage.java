package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class maximumMinimumAverage {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        int max=list.get(0);
        int min = list.get(0);
        int sum =0;

        for (Integer each:list){
            if(each>max){
                max=each;
            }
            if ((each<min)){
                min=each;
            }
            sum+=each;
        }
        double average=sum/ list.size();
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}

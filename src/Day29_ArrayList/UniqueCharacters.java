package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word ="slhalkalkkll";
        String[] array= word.split("");

        ArrayList<String>list=new ArrayList<>(Arrays.asList(array));


        String result="";
        list.removeIf(p-> Collections.frequency(list, p)==1);
        System.out.println(list);

        for (String each:list){

            if(!result.contains(each)){
                result+=each;
            }
        }

        System.out.println(result);



    }
}

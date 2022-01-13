package Day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
        list.removeIf(p-> p<5 );

        //for (int i = 0; i < list.size(); i++) {
           // if(list.get(i)%2 !=0){
               // list.removeIf()
        //    }

        System.out.println(list);
        System.out.println("-----------");

        list.removeIf(each-> each%2!=0);
        System.out.println(list);
        System.out.println("-----------------");

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Java", "Python", "Javascript"));
        list3.removeIf(p-> p.startsWith("J")); // remove p(each element of array) if it starts with "J";
        System.out.println(list3);
        System.out.println("--------------------------");

        ArrayList<String> names= new ArrayList<>(Arrays.asList("Anna", "raecar", "level","eye"));
        names.removeIf(name-> !StringUtility.isPalindrome(name));
        System.out.println(names);

        }

    }


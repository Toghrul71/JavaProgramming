package day23_Tasks;

import java.util.Arrays;

public class fullName {
    public static void main(String[] args) {

        fullName("ToGhrul","Huseynov");

    }
    public static void fullName(String firstName, String lastName){

        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();

        String result1= firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String result2=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String fullResult=result1+" "+result2;
        System.out.println(fullResult);





    }
}

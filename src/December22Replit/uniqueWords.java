package December22Replit;

import java.util.Arrays;

public class uniqueWords {
    public static void main(String[] args) {
        person("jon,doe,30");

    }

    public static void person (String info) {

        String[] array=info.split(",");

        System.out.println("person name:"+ array[0]);
        System.out.println("last name:"+ array[1]);
        System.out.println("age: "+ array[2]);

    }
}

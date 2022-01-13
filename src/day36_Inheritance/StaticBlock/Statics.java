package day36_Inheritance.StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class Statics {
    public static int num;
    public static ArrayList<String> cars;

    static{
        num=5;
        cars=new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Toyota"));
    }

    public Statics() {
    }

    @Override
    public String toString() {
        return "Statics{}";
    }
}

package day34_GarbageCollection_AccessModifier;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;


    public Circle(double radius){// its called constructor
        this.radius=radius;

    }
    static{
        pi=3.14;
        name="Circle";

        numbers=new ArrayList<>(); // whenever there is static variable that need s several steps then static block is used
        numbers.add(10);
        numbers.add(20);
    }

}

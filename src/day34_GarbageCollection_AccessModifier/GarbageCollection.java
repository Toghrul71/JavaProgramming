package day34_GarbageCollection_AccessModifier;

import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        str=null;
        System.out.println(str);

        Car car1=new Car("Toyota");
        car1=null;
        System.out.println(car1);
        System.out.println("------------------");

        String language="Python";// Python is eligible for garbage collection
        language="Java";
        System.out.println(language);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2=list1;
        list1.addAll(Arrays.asList(200,300,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        Student student1=new Student("Toghrul",36,'M','B',17);
        student1.grade='A';
        Student student2=student1;
        student2.name="Ahmed";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("-----------------");

        ArrayList<String> l1=new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        System.out.println(l1);
        System.out.println(l2);
    }
}

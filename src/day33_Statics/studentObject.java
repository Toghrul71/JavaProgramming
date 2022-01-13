package day33_Statics;

import java.util.Arrays;
import java.util.Collections;

public class studentObject {
    public static void main(String[] args) {

        Student student1=new Student("Toghrul",'m',36,33,'l') ;
        System.out.println(student1);

        Student student2=new Student("Good");
        System.out.println(student2);

        student1.study("Toghrul");
        student1.lives("Toghrul");

        Student[] students={student1,student2};
        System.out.println(Arrays.toString(students));

    }
}

package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Tony", 36, 'M', 'B', 14);

        Student student2=new Student("Good", 35, 'M','D', 15);

        System.out.println(student1);
        System.out.println(student2);

        Student[] studentss={student1,student2};
        ArrayList<Student> malesStudents=new ArrayList<>(Arrays.asList(studentss));

    }
}

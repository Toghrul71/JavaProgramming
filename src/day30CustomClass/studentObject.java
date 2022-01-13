package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class studentObject {
    public static void main(String[] args) {

        Students student1=new Students();  // student object
        student1.setInfo("Good", 25, "M", 'A'); // set attributes
        System.out.println(student1);

        Students student2=new Students();
        student2.setInfo("John", 26, "M",'G');
        System.out.println(student2);

        Students student3=new Students();
        student3.setInfo("Hi", 20, "F",'H');

        Students student4=new Students();
        student4.setInfo("Di",19,"M",'J');

        Students student5=new Students();
        student5.setInfo("Gabby",24,"F",'L');

        Students[] students={student1,student2,student3,student4,student5};
        for (Students student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------------");

        ArrayList<Students>earlyBirds=new ArrayList<>(Arrays.asList(student1,student2));

        ArrayList<Students>angryBirds=new ArrayList<>(Arrays.asList(student1,student2));
        // remove ones are not matching

        for (Students student:students){
            if(student.grade=='L'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }
        System.out.println("early "+earlyBirds);
        System.out.println("angry" +angryBirds);

        student1.likes();
        student2.learns();

    }
}

package day36_Inheritance;

public class StudentObject {
    public static void main(String[] args) {
        Student encapsulation1=new Student("Toghrul",36,'M','A',"CYDEO");
        System.out.println(encapsulation1);
        encapsulation1.study("Toghrul");
        System.out.println(encapsulation1.getAge());
        encapsulation1.setAge(35);
        System.out.println(encapsulation1);
    }
}

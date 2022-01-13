package day35_Encapsulation;

public class personObject {
    public static void main(String[] args) {
        Person person1=new Person("John", "English", 36,'M');
        System.out.println(person1);
        System.out.println(person1.name);
        person1.eat("Salad");

    }
}

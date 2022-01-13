package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Toghrul");
        person1.setAge(36);

        System.out.println(person1.getName()+" : "+person1.getAge());

        Person person2=new Person();
        person2.setName("Tony");
        person2.setAge(36);
        System.out.println(person2.getName()+" : "+person2.getAge());
    }

}

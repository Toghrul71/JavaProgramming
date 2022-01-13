package day37_Inheritance.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("Rex","Husky",'M',3,"M","White");
        System.out.println(dog1);

        Cat cat1=new Cat("Love","Siamese",'F',2,"large","White");
        System.out.println(cat1);
        System.out.println(cat1.name);
    }


}

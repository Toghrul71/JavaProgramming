package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Taiga","German",'M',1,"M","White");
        dog.eat();
        dog.drink();
        dog.sleep();

        Cat cat=new Cat();
        cat.setInfo("Meow","Good",'M',1,"S","White");

        Tiger tiger=new Tiger();
        tiger.setInfo("Sher","Bengal",'F',2,"L","White");
        tiger.eat();
        System.out.println(tiger);
    }
}

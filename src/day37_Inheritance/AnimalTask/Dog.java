package day37_Inheritance.AnimalTask;

public class Dog extends Animal {


    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name,breed,gender,age,size,color);  // super keyword is used to pass parameters of child class constructor to parent class

    }
    public void bark(){
        System.out.println(name+" is barking");
    }
}

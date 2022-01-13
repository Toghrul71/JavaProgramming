package day37_Inheritance.AnimalTask;

public class Cat extends Animal{
    public String favouriteFood;
    // calling this constructor is mandatory because cat class needs to have all the variables
    public Cat(String name, String breed, char gender, int age, String size, String color) { // in this class this constructor can call parent class constructor
        super(name, breed, gender, age, size, color); // super sets all variables of parent class
        this.favouriteFood=favouriteFood;// extra variable for cat class
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }
}

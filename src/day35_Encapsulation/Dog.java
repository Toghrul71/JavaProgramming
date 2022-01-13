package day35_Encapsulation;

public class Dog {
    public String breed, color;
    public char size, gender;
    public int age;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    static {
        isFriendly=true;
        numberOfLegs=4;
        numberOfEyes=2;
        numberOfWings=0;
    }

    public Dog(String breed, String color, char size, char gender, int age) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }
    public void eat(){
        System.out.println(breed+" eats");
    }
    public void drink(){
        System.out.println(breed+" drinks");
    }
    public void sleep(){
        System.out.println(breed+" sleeps");
    }
    public void play(){
        System.out.println(breed+" plays");
    }
    public void bark(){
        System.out.println(breed+" barks");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                ", number of eyes=" + numberOfEyes +
                ", number of legs=" + numberOfLegs +
                ", number of wings=" + numberOfWings +
                ", is friendly=" + isFriendly +
                '}';
    }

}

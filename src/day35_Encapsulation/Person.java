package day35_Encapsulation;

public class Person {
    public String name, language;
    public int age;
    public char gender;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;
    public static String planet;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }
    public void printPlanetName(){ // called void method, because it doesn't return any value
        System.out.println("Planet name for "+name+" is "+planet);
    }
    public void eat(String food){  // called void method, because it doesn't return any value
        System.out.println(name+" eats "+food);
    }
    public void drink(String drink){
        System.out.println(name+" drinks "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", is human=" + isHuman +
                ", has nose=" + hasNose +
                ", number oh head=" + numberOfHead +
                ", number of wings=" + numberOfWings +
                ", planet=" + planet +
                '}';
    }
}

package day35_Encapsulation;

public class PersonD {
    public String name;  // instance variable- different for every person
    public int age;// instance variable- different for every person
    public char gender;// instance variable- different for every person
    public String language;// instance variable- different for every person

    public static String planet;  // static variable- same for every person
    public static boolean isHuman, hasNose;// static variable- same for every person
    public static int numberOfWings, numberOfHead;// static variable- same for every person

    public PersonD(String name, int age, char gender, String language) {
        this.name = name;  // to call instance variable name
        this.age = age; // to call instance variable age
        this.gender = gender; // to call instance variable age
        this.language = language; // to call instance variable age

    }
    static {// to set static variables
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }

    public static void printPlanetName(){ // method doesnt need any instances so its static method
        System.out.println("Planet name is "+planet);
    }
    public void eat(String food){  // method need instance variable so its void method
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){// method need instance variable so its void method
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "PersonD{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}

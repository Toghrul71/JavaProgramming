package January2Tasks;

public class Person {
    public String name;
    public int age;
    public char gender;
    public static boolean isHuman=true;
    public static boolean hasNose=true;
    public static boolean hasWings=true;
    public static int numberOfHead=1;
    public static int numberOfEyes=2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(String food){
        System.out.println(name+" eats "+food);
            }
            public void drink(String drink){
                System.out.println(name+" drinks "+drink);
            }
            public void sleep(String name){
                System.out.println(name+" sleeps");
            }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", hasWings=" + hasWings +
                ", numberOfHead=" + numberOfHead +
                ", numberOfEyes=" + numberOfEyes +
                '}';
    }
}

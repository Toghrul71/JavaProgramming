package day35_Encapsulation.encapsulation;

public class Person {
    private String name;  // private instance variables
    private int age;     // private instance variables

    // getter reads variable


    public String getName() { // reads variable
        return name;  // returns instance variable name, other classes can access it through getter
    }

    public void setName(String name) {  // assigns variable name

        this.name = name;
    }

    public int getAge() {
        return age;
    }  // whenever you call get age it gets you age

    public void setAge(int age) {
        if(age<=0 || age>150){
            System.out.println("Invalid age "+age);
            System.exit(0);
        }
        this.age = age;
    }
}

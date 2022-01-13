package day33_Statics;

public class Employee {
    public String name;  // variable
    public int age;
    public String jobTitle;
    public static String companyName="Apple Inc.";  // same for all

    public Employee(String name, int age, String jobTitle) {
        this.name = name;  // constructor
        this.age = age;
        this.jobTitle = jobTitle;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}


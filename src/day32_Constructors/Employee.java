package day32_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {  // first constructor
        this.name = name;
    }

    public Employee(String name, char gender) {  // second constructor
        this(name); // call first constructor by this()
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {  // second constructor
        // call first constructor by this()
        //this.name=name; // call first constructor by this()
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {  // second constructor
        // call first constructor by this()
        //this.name=name; // call first constructor by this()
        this(name, gender, jobTitle);
        this.salary = salary;

    }

}
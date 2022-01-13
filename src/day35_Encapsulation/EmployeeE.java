package day35_Encapsulation;

public class EmployeeE {
    private String name;
    private char gender;
    private int age;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Invalid name "+name);
            System.exit(0);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender "+gender);
            System.exit(0);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age==0 || age<0 || age>150){
            System.err.println("Invalid age "+age);
            System.exit(0);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("Invalid salary "+salary);
            System.exit(0);
        }
        this.salary = salary;
    }
}

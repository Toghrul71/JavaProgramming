package day36_Inheritance.Employee;

public class Employee {
    public String name, jobTitle, companyName;
    public int age;
    public int ID;
    public double salary;

    public void setInfo(String name, String jobTitle, String companyName, int age, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.ID=ID;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}

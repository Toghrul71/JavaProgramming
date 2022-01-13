package day37_Inheritance.AnimalTask.Person;

public class Employee extends Person {
    public int ID;
   public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender) {
        super(name,age,gender);
       this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                "age=" + age +
                "gender=" + gender +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

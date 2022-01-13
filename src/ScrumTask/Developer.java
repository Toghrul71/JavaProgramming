package ScrumTask;

public class Developer extends Employee {
    public String runtimeMachine;

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String runtimeMachine) {
        super(name, age, gender, ID, jobTitle, salary);
        this.runtimeMachine = runtimeMachine;
    }
    public void usingJVM(String JVM){
        System.out.println(name+" is using "+JVM);
    }

    public String toString() {
        return "Developer{" +

                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", runtimeMachine='" + runtimeMachine + '\'' +
                '}';
    }
}

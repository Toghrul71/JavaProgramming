package ScrumTask;

public class Tester extends Employee {
    public String automationTool;

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String automationTool) {
        super(name, age, gender, ID, jobTitle, salary);
        this.automationTool = automationTool;
    }

    public String toString() {
        return "Tester{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", automationTool='" + automationTool + '\'' +
                '}';
    }
}
